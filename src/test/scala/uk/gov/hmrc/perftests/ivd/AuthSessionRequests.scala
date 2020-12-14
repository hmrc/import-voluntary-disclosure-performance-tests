/*
 * Copyright 2020 HM Revenue & Customs
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


object AuthSessionRequests extends BaseRequests with Pages {

  val authWizUrl: String = baseUrlFor("auth-login-stub") + "/auth-login-stub/gg-sign-in"
  val authSession: String = baseUrlFor("auth-login-stub") + "/auth-login-stub/session"

  val getAuthLogin: HttpRequestBuilder =
    http("get Auth Login Page")
      .get(AuthLoginPage.authStubUrl)
      .check(status.is(200))

  val authLogin: HttpRequestBuilder =
    http("Auth Login Page")
      .post(AuthLoginPage.authStubUrl)
      .formParam("confidenceLevel", "50")
      .formParam("credentialStrength", "strong")
      .formParam("authorityId", "")
      .formParam("affinityGroup", "Organisation")
      .formParam("redirectionUrl", "/coronavirus-job-retention-bonus")
      .formParam("gatewayToken", "")
      .formParam("usersName", "")
      .formParam("email", "user@test.com")
      .formParam("credentialRole", "User")
      .formParam("nino", "")
      .formParam("groupIdentifier", "")
      .formParam("agent.agentId", "")
      .formParam("agent.agentCode", "")
      .formParam("agent.agentFriendlyName", "")
      .formParam("unreadMessageCount", "")
      .formParam("enrolment[0].name", "IR-PAYE")
      .formParam("enrolment[0].taxIdentifier[0].name", "TaxOfficeNumber")
      .formParam("enrolment[0].taxIdentifier[1].name", "TaxOfficeReference")
      .formParam("enrolment[0].taxIdentifier[0].value", "${taxOfficeNumber}")
      .formParam("enrolment[0].taxIdentifier[1].value", "${taxOfficeReference}")
      .formParam("enrolment[0].state", "Activated")
      .check(status.is(303))
      .check( headerRegex("Set-Cookie", """mdtp=(.*)""").saveAs("mdtpCookie") )

}

