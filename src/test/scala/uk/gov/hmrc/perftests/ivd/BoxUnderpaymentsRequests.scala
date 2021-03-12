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

}
