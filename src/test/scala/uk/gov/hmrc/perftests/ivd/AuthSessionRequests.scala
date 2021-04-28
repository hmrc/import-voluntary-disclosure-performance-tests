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


object AuthSessionRequests extends BaseRequests with Pages {

  val authWizUrl: String = baseUrlFor("auth-login-stub") + "/auth-login-stub/gg-sign-in"
  val authSession: String = baseUrlFor("auth-login-stub") + "/auth-login-stub/session"

  val redirectUrl: String = if (runLocal) baseUrlFor("import-voluntary-disclosure-frontend") + "/disclose-import-taxes-underpayment" else "/import-voluntary-disclosure-frontend"

  val getAuthLogin: HttpRequestBuilder =
    http("get Auth Login Page")
      .get(AuthLoginPage.authStubUrl)
      .check(status.is(200))

  val authLogin: HttpRequestBuilder =
    http("Auth Login Page")
      .post(AuthLoginPage.authStubUrl)
      .formParam("authorityId", "")
      .formParam("gatewayToken", "")
      .formParam("redirectionUrl", "/disclose-import-taxes-underpayment")
      .formParam("credentialStrength", "weak")
      .formParam("confidenceLevel", "50")
      .formParam("affinityGroup", "Organisation")
      .formParam("usersName", "")
      .formParam("email", "user@test.com")
      .formParam("credentialRole", "User")
      .formParam("nino", "")
      .formParam("groupIdentifier", "")
      .formParam("agent.agentId", "")
      .formParam("agent.agentCode", "")
      .formParam("agent.agentFriendlyName", "")
      .formParam("unreadMessageCount", "")
      .formParam("mdtp.sessionId", "")
      .formParam("mdtp.deviceId", "")
      .formParam("enrolment[0].name", "HMRC-CTS-ORG")
      .formParam("enrolment[0].taxIdentifier[0].name", "EORINumber")
      .formParam("enrolment[0].taxIdentifier[0].value", "GB987654321000")
      .formParam("enrolment[0].state", "Activated")
      .formParam("enrolment[1].name", "")
      .formParam("enrolment[1].taxIdentifier[0].name", "")
      .formParam("enrolment[1].taxIdentifier[0].value", "")
      .formParam("enrolment[1].state", "Activated")
      .formParam("enrolment[2].name", "")
      .formParam("enrolment[2].taxIdentifier[0].name", "")
      .formParam("enrolment[2].taxIdentifier[0].value", "")
      .formParam("enrolment[2].state", "Activated")
      .formParam("enrolment[3].name", "")
      .formParam("enrolment[3].taxIdentifier[0].name", "")
      .formParam("enrolment[3].taxIdentifier[0].value", "")
      .formParam("enrolment[3].state", "Activated")
      .formParam("itmp.givenName", "")
      .formParam("itmp.middleName", "")
      .formParam("itmp.familyName", "")
      .formParam("itmp.dateOfBirth", "")
      .formParam("itmp.address.line1", "")
      .formParam("itmp.address.line2", "")
      .formParam("itmp.address.line3", "")
      .formParam("itmp.address.line4", "")
      .formParam("itmp.address.line5", "")
      .formParam("itmp.address.postCode", "")
      .formParam("itmp.address.countryName", "")
      .formParam("itmp.address.countryCode", "")
      .check(status.is(303))
      .check( headerRegex("Set-Cookie", """mdtp=(.*)""").saveAs("mdtpCookie") )
}

