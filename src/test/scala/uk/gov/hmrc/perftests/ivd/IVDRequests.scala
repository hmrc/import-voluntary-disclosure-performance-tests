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
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

import scala.annotation.tailrec

object IVDRequests extends BaseRequests with Pages {

  def buildGetRequest(page: Page, csrf: Boolean = true): HttpRequestBuilder = {
    if (csrf.equals(true)) {
      http(s"get ${page.name} Page")
        .get(page.url)
        .check(status.is(200))
        .check(saveCsrfToken)
    }
    else {
      http(s"get ${page.name} Page")
        .get(page.url)
        .check(status.is(200))
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

  val getIndexPage: HttpRequestBuilder =
    http("Initial get after auth to force redirect")
      .get(IndexPage.url)
      .header("Cookie", "mdtp=${mdtpCookie}")
      .check(status.is(303))

  val getUserType: HttpRequestBuilder = buildGetRequest(UserTypePage)
  val postUserType: HttpRequestBuilder = buildPostRequest(UserTypePage, Some(List(("value","importer"))))

  val getNumberOfEntries: HttpRequestBuilder = buildGetRequest(NumberOfEntriesPage)
  val postNumberOfEntries: HttpRequestBuilder = buildPostRequest(NumberOfEntriesPage, Some(List(("value", "oneEntry"))))

  val getEntryDetails: HttpRequestBuilder = buildGetRequest(EntryDetailsPage)
  val postEntryDetails: HttpRequestBuilder = buildPostRequest(EntryDetailsPage,
    Some(List(
      ("epu", "123"),
      ("entryNumber", "123456Q"),
      ("entryDate.day", "01"),
      ("entryDate.month", "01"),
      ("entryDate.year", "2021"))))

  val getAcceptanceDate: HttpRequestBuilder = buildGetRequest(AcceptanceDatePage)
  val postAcceptanceDate: HttpRequestBuilder = buildPostRequest(AcceptanceDatePage, Some(List(("value", "true"))))

  val getCustomsProcedureCode: HttpRequestBuilder = buildGetRequest(CustomsProcedureCodePage)
  val postCustomsProcedureCode: HttpRequestBuilder = buildPostRequest(CustomsProcedureCodePage, Some(List(("value", "false"))))

  val getUnderpaymentType: HttpRequestBuilder = buildGetRequest(UnderpaymentTypePage)
  val postUnderpaymentType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage,
    Some(List(
      ("customsDuty", "true"),
      ("importVAT", "true"),
      ("exciseDuty", "true"))))


  val getCustomsDuty: HttpRequestBuilder = buildGetRequest(CustomsDutyPage)
  val postCustomsDuty: HttpRequestBuilder = buildPostRequest(CustomsDutyPage,
    Some(List(
      ("original", "200"),
      ("amended", "300"))))

  val getImportVAT: HttpRequestBuilder = buildGetRequest(CustomsDutyPage)
  val postImportVAT: HttpRequestBuilder = buildPostRequest(CustomsDutyPage,
    Some(List(
      ("original", "350"),
      ("amended", "500"))))

  val getExciseDutyDetails: HttpRequestBuilder = buildGetRequest(ExciseDutyDetailsPage)
  val postExciseDutyDetails: HttpRequestBuilder = buildPostRequest(ExciseDutyDetailsPage,
    Some(List(
      ("original", "200"),
      ("amended", "300"))))

  val getUnderpaymentSummary: HttpRequestBuilder = buildGetRequest(UnderpaymentSummaryPage, false)

  val getSupportingDocumentation: HttpRequestBuilder = buildGetRequest(SupportingDocumentsPage, false)

}
