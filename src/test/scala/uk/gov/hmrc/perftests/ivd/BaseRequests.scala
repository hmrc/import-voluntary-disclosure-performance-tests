/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.perftests.ivd

import io.gatling.core.Predef._
import io.gatling.core.check.CheckSupport
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import uk.gov.hmrc.performance.conf._

import scala.annotation.tailrec

trait BaseRequests extends ServicesConfiguration with HttpConfiguration with CheckSupport {

  trait WithIdx {
    val url: String
    val relativeUrl: String
    val page: String

    def urlWithIdx(idx: Int): String = url + idx + page
    def relativeUrlWithIdx (idx: Int): String = relativeUrl +idx + page
  }

  //Creates whole paths/relative paths
  class Page (path: String, friendlyName: String = "") {
    val url: String = ivdBaseUrl + contextName + path
    val upscanCallBackUrl: String = ivdBaseUrl + path
    val relativeUrl: String = contextName + path
    val authStubUrl: String = authStubPort + authLoginStub + path
    val name: String = friendlyName
  }

  protected val csrfPattern = """<input type="hidden" name="csrfToken" value="([^"]+)"""

  def saveCsrfToken = regex(csrfPattern).saveAs("csrfToken")

  //save bearer tokens
  val saveBearerTokenFromBody = css("""td[data-session-id="authToken"] code""").find.saveAs("bearerToken")

  //Local Host Ports
  val ivdBaseUrl: String = baseUrlFor("import-voluntary-disclosure-frontend")
  val authBaseUrl: String = baseUrlFor("auth-login-api-service")
  val authStubPort: String = baseUrlFor("auth-login-stub")

  //Service Names
  val contextName: String = "/disclose-import-taxes-underpayment"
  val authLoginStub: String = "/auth-login-stub"

  def buildGetRequest(page: Page, csrf: Boolean = true, expectedStatus: Int = 200): HttpRequestBuilder = {
    if (csrf.equals(true)) {
      http(s"get ${page.name} Page")
        .get(page.url)
        .check(status.is(expectedStatus))
        .check(saveCsrfToken)
    }
    else {
      http(s"get ${page.name} Page")
        .get(page.url)
        .check(status.is(expectedStatus))
    }
  }

  def buildPostRequest(page: Page, formParams: Option[List[(String, Any)]] = None): HttpRequestBuilder = {
    if (formParams.isDefined) {
      val baseRequest = {
        http(s"post ${page.name} Page")
          .post(page.url)
      }

      @tailrec
      def addFormParams(formParams: List[(String, Any)], httpRequestBuilder: HttpRequestBuilder): HttpRequestBuilder = {
        formParams match {
          case Nil => httpRequestBuilder.formParam("csrfToken", s"$${csrfToken}").check(status.is(303))
          case ::(head, tl) => addFormParams(tl, httpRequestBuilder.formParam(head._1, head._2))
        }
      }
      addFormParams(formParams.get, baseRequest)
    }
    else {
      http(s"post ${page.name} Page")
        .post(page.url)
        .formParam("csrfToken", s"$${csrfToken}")
        .check(status.is(303))
    }
  }

}
