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
import uk.gov.hmrc.perftests.ivd.IVDRequests.{buildGetRequest, buildPostRequest}

import scala.annotation.tailrec

object BoxUnderpaymentsRequests extends BaseRequests with Pages {

  val getBoxGuidancePage: HttpRequestBuilder = buildGetRequest(BoxGuidancePage,false)

  val getBoxNumber: HttpRequestBuilder = buildGetRequest(BoxNumberPage)
  val postBoxNumber22: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "22"))))
  val postBoxNumber33: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "33"))))
  val postBoxNumber34: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "34"))))
  val postBoxNumber35: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "35"))))
  val postBoxNumber36: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "36"))))
  val postBoxNumber37: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "37"))))
  val postBoxNumber38: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "38"))))
  val postBoxNumber39: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "39"))))
  val postBoxNumber41: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "41"))))
  val postBoxNumber42: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "42"))))
  val postBoxNumber43: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "43"))))
  val postBoxNumber45: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "45"))))
  val postBoxNumber46: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "46"))))
  val postBoxNumber62: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "62"))))
  val postBoxNumber63: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "63"))))
  val postBoxNumber66: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "66"))))
  val postBoxNumber67: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "67"))))
  val postBoxNumber68: HttpRequestBuilder = buildPostRequest(BoxNumberPage, Some(List(("value", "68"))))

  val getBoxItemLevel: HttpRequestBuilder = buildGetRequest(BoxItemLevelPage)
  val postBoxItemLevel: HttpRequestBuilder = buildPostRequest(BoxItemLevelPage, Some(List(("itemNumber", "1"))))

  val getEnterBox22ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox22ValuePage)
  val postEnterBox22ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox22ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getEnterBox33ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox33ValuePage)
  val postEnterBox33ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox33ValuePage, Some(List(
    ("original", "1234567891ABCD"), ("amended", "1987654321DCBA"))))

  val getEnterBox34ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox34ValuePage)
  val postEnterBox34ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox34ValuePage, Some(List(
    ("original", "CY"), ("amended", "GB"))))

  val getEnterBox35ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox35ValuePage)
  val postEnterBox35ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox35ValuePage, Some(List(
    ("original", "200"), ("amended", "300"))))

  val getEnterBox36ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox36ValuePage)
  val postEnterBox36ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox36ValuePage, Some(List(
    ("original", "123"), ("amended", "234"))))

  val getEnterBox37ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox37ValuePage)
  val postEnterBox37ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox37ValuePage, Some(List(
    ("original", "1234A67"), ("amended", "7654C21"))))

  val getEnterBox38ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox38ValuePage)
  val postEnterBox38ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox38ValuePage, Some(List(
    ("original", "100.20"), ("amended", "101.20"))))

  val getEnterBox39ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox39ValuePage)
  val postEnterBox39ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox39ValuePage, Some(List(
    ("original", "051187"), ("amended", "051186"))))

  val getEnterBox41ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox41ValuePage)
  val postEnterBox41ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox41ValuePage, Some(List(
    ("original", "100.00"), ("amended", "200.00"))))

  val getEnterBox42ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox42ValuePage)
  val postEnterBox42ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox42ValuePage, Some(List(
    ("original", "50"), ("amended", "60"))))

  val getEnterBox43ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox43ValuePage)
  val postEnterBox43ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox43ValuePage, Some(List(
    ("original", "1"), ("amended", "5"))))

  val getEnterBox45ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox45ValuePage)
  val postEnterBox45ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox45ValuePage, Some(List(
    ("original", "A12.5"), ("amended", "B12.5"))))

  val getEnterBox46ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox46ValuePage)
  val postEnterBox46ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox46ValuePage, Some(List(
    ("original", "100.50"), ("amended", "200.50"))))

  val getEnterBox62ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox62ValuePage)
  val postEnterBox62ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox62ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getEnterBox63ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox63ValuePage)
  val postEnterBox63ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox63ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getEnterBox66ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox66ValuePage)
  val postEnterBox66ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox66ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getEnterBox67ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox67ValuePage)
  val postEnterBox67ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox67ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getEnterBox68ValuePage: HttpRequestBuilder = buildGetRequest(EnterBox68ValuePage)
  val postEnterBox68ValuePage: HttpRequestBuilder = buildPostRequest(EnterBox68ValuePage, Some(List(
    ("original", "EUR125.00"), ("amended", "GBP125.00"))))

  val getUnderpaymentBoxConfirmationPage: HttpRequestBuilder = buildGetRequest(UnderpaymentBoxConfirmationPage, csrf = false)
  val postUnderpaymentBoxConfirmationPage: HttpRequestBuilder = buildPostRequest(UnderpaymentBoxConfirmationPage)

  val getBoxReasonSummary: HttpRequestBuilder = buildGetRequest(BoxReasonSummaryPage, false)
  val postBoxReasonSummary: HttpRequestBuilder = buildPostRequest(BoxReasonSummaryPage, Some(List(("value", "false"))))

  val getInitialiseChangeBox22Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(22, 0), false, expectedStatus = 303)
  val getInitialiseChangeBox33Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(33, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox34Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(34, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox35Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(35, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox36Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(36, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox37Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(37, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox38Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(38, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox39Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(39, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox41Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(41, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox42Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(42, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox43Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(43, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox45Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(45, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox46Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(46, 1), false, expectedStatus = 303)
  val getInitialiseChangeBox62Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(62, 0), false, expectedStatus = 303)
  val getInitialiseChangeBox63Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(63, 0), false, expectedStatus = 303)
  val getInitialiseChangeBox66Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(66, 0), false, expectedStatus = 303)
  val getInitialiseChangeBox67Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(67, 0), false, expectedStatus = 303)
  val getInitialiseChangeBox68Reason: HttpRequestBuilder = buildGetRequest(InitialiseChangeBoxReasonPage(68, 0), false, expectedStatus = 303)
  val getChangeBoxReason: HttpRequestBuilder = buildGetRequest(ChangeBoxReasonPage, false)

  val getRemoveBoxReason: HttpRequestBuilder = buildGetRequest(RemoveBoxReasonPage, false)
  val postRemoveBoxReason: HttpRequestBuilder = buildPostRequest(RemoveBoxReasonPage, Some(List(("value", "false"))))

  val getItemNumberForBoxReason: HttpRequestBuilder = buildGetRequest(ChangeItemNumberForBoxReasonPage, false)
  val postItemNumberForBoxReason: HttpRequestBuilder = buildPostRequest(ChangeItemNumberForBoxReasonPage, Some(List(("itemNumber", "5"))))

  val getChangeBox22ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox22ValuePage)
  val postChangeBox22ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox22ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getChangeBox33ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox33ValuePage)
  val postChangeBox33ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox33ValuePage, Some(List(
    ("original", "1234567891AAAA"), ("amended", "1987654321BBBB"))))

  val getChangeBox34ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox34ValuePage)
  val postChangeBox34ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox34ValuePage, Some(List(
    ("original", "US"), ("amended", "UK"))))

  val getChangeBox35ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox35ValuePage)
  val postChangeBox35ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox35ValuePage, Some(List(
    ("original", "201"), ("amended", "302"))))

  val getChangeBox36ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox36ValuePage)
  val postChangeBox36ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox36ValuePage, Some(List(
    ("original", "222"), ("amended", "333"))))

  val getChangeBox37ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox37ValuePage)
  val postChangeBox37ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox37ValuePage, Some(List(
    ("original", "1234B67"), ("amended", "7654B21"))))

  val getChangeBox38ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox38ValuePage)
  val postChangeBox38ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox38ValuePage, Some(List(
    ("original", "200.20"), ("amended", "201.20"))))

  val getChangeBox39ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox39ValuePage)
  val postChangeBox39ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox39ValuePage, Some(List(
    ("original", "051188"), ("amended", "051189"))))

  val getChangeBox41ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox41ValuePage)
  val postChangeBox41ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox41ValuePage, Some(List(
    ("original", "101.00"), ("amended", "201.00"))))

  val getChangeBox42ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox42ValuePage)
  val postChangeBox42ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox42ValuePage, Some(List(
    ("original", "51"), ("amended", "61"))))

  val getChangeBox43ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox43ValuePage)
  val postChangeBox43ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox43ValuePage, Some(List(
    ("original", "2"), ("amended", "6"))))

  val getChangeBox45ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox45ValuePage)
  val postChangeBox45ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox45ValuePage, Some(List(
    ("original", "A22.5"), ("amended", "B22.5"))))

  val getChangeBox46ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox46ValuePage)
  val postChangeBox46ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox46ValuePage, Some(List(
    ("original", "101.50"), ("amended", "201.50"))))

  val getChangeBox62ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox62ValuePage)
  val postChangeBox62ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox62ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getChangeBox63ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox63ValuePage)
  val postChangeBox63ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox63ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getChangeBox66ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox66ValuePage)
  val postChangeBox66ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox66ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getChangeBox67ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox67ValuePage)
  val postChangeBox67ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox67ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getChangeBox68ValuePage: HttpRequestBuilder = buildGetRequest(ChangeBox68ValuePage)
  val postChangeBox68ValuePage: HttpRequestBuilder = buildPostRequest(ChangeBox68ValuePage, Some(List(
    ("original", "EUR225.00"), ("amended", "GBP225.00"))))

  val getConfirmationBoxChangePage: HttpRequestBuilder = buildGetRequest(ConfirmationBoxChangePage, csrf = false)
  val postConfirmationBoxChangePage: HttpRequestBuilder = buildPostRequest(ConfirmationBoxChangePage)

}
