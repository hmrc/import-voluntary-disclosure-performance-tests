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

import io.gatling.http.request.builder.HttpRequestBuilder

object UnderpaymentsRequests extends BaseRequests with Pages {

  val getUnderpaymentIntroduction: HttpRequestBuilder = buildGetRequest(UnderpaymentIntroductionPage, false)

  val getUnderpaymentType: HttpRequestBuilder = buildGetRequest(UnderpaymentTypePage)
  val postImportVATDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "B00"))))
  val postCustomsDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A00"))))
  val postExciseDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "E00"))))
  val postAdditionalDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A20"))))
  val postDefinitiveDumpingDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A30"))))
  val postProvisionalDumpingDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A35"))))
  val postDefinitiveCountervailingDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A40"))))
  val postProvisionalCountervailingDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A45"))))
  val postAgriculturalProductsType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "A10"))))
  val postCompensatoryDutyType: HttpRequestBuilder = buildPostRequest(UnderpaymentTypePage, Some(List(("value", "D10"))))

  val getImportVATUnderpayment: HttpRequestBuilder = buildGetRequest(ImportVATUnderpaymentPage)
  val postImportVATUnderpayment: HttpRequestBuilder = buildPostRequest(ImportVATUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getCustomsDutyUnderpayment: HttpRequestBuilder = buildGetRequest(CustomsDutyUnderpaymentPage)
  val postCustomsDutyUnderpayment: HttpRequestBuilder = buildPostRequest(CustomsDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getExciseDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ExciseDutyUnderpaymentPage)
  val postExciseDutyUnderpayment: HttpRequestBuilder = buildPostRequest(ExciseDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getAdditionalDutyUnderpayment: HttpRequestBuilder = buildGetRequest(AdditionalDutyUnderpaymentPage)
  val postAdditionalDutyUnderpayment: HttpRequestBuilder = buildPostRequest(AdditionalDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getDefinitiveDumpingDutyUnderpayment: HttpRequestBuilder = buildGetRequest(DefinitiveDumpingDutyUnderpaymentPage)
  val postDefinitiveDumpingDutyUnderpayment: HttpRequestBuilder = buildPostRequest(DefinitiveDumpingDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getProvisionalDumpingDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ProvisionalDumpingDutyUnderpaymentPage)
  val postProvisionalDumpingDutyUnderpayment: HttpRequestBuilder = buildPostRequest(ProvisionalDumpingDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getDefinitiveCountervailingDutyUnderpayment: HttpRequestBuilder = buildGetRequest(DefinitiveCountervailingDutyUnderpaymentPage)
  val postDefinitiveCountervailingDutyUnderpayment: HttpRequestBuilder = buildPostRequest(DefinitiveCountervailingDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getProvisionalCountervailingDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ProvisionalCountervailingDutyUnderpaymentPage)
  val postProvisionalCountervailingDutyUnderpayment: HttpRequestBuilder = buildPostRequest(ProvisionalCountervailingDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getAgriculturalProductsUnderpayment: HttpRequestBuilder = buildGetRequest(AgriculturalProductsUnderpaymentPage)
  val postAgriculturalProductsUnderpayment: HttpRequestBuilder = buildPostRequest(AgriculturalProductsUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))

  val getCompensatoryDutyUnderpayment: HttpRequestBuilder = buildGetRequest(CompensatoryDutyUnderpaymentPage)
  val postCompensatoryDutyUnderpayment: HttpRequestBuilder = buildPostRequest(CompensatoryDutyUnderpaymentPage,
    Some(List(
      ("original", "100"),
      ("amended", "200"))))


  val getImportVATUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(ImportVATUnderpaymentConfirmPage, false)
  val postImportVATUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(ImportVATUnderpaymentConfirmPage)
  val getCustomsDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(CustomsDutyUnderpaymentConfirmPage, false)
  val postCustomsDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(CustomsDutyUnderpaymentConfirmPage)
  val getExciseDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(ExciseDutyUnderpaymentConfirmPage, false)
  val postExciseDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(ExciseDutyUnderpaymentConfirmPage)
  val getAdditionalDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(AdditionalDutyUnderpaymentConfirmPage, false)
  val postAdditionalDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(AdditionalDutyUnderpaymentConfirmPage)
  val getDefinitiveDumpingDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(DefinitiveDumpingDutyUnderpaymentConfirmPage, false)
  val postDefinitiveDumpingDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(DefinitiveDumpingDutyUnderpaymentConfirmPage)
  val getProvisionalDumpingDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(ProvisionalDumpingDutyUnderpaymentConfirmPage, false)
  val postProvisionalDumpingDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(ProvisionalDumpingDutyUnderpaymentConfirmPage)
  val getDefinitiveCountervailingDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(DefinitiveCountervailingDutyUnderpaymentConfirmPage, false)
  val postDefinitiveCountervailingDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(DefinitiveCountervailingDutyUnderpaymentConfirmPage)
  val getProvisionalCountervailingDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(ProvisionalCountervailingDutyUnderpaymentConfirmPage, false)
  val postProvisionalCountervailingDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(ProvisionalCountervailingDutyUnderpaymentConfirmPage)
  val getAgriculturalProductsUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(AgriculturalProductsUnderpaymentConfirmPage, false)
  val postAgriculturalProductsUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(AgriculturalProductsUnderpaymentConfirmPage)
  val getCompensatoryDutyUnderpaymentConfirm: HttpRequestBuilder = buildGetRequest(CompensatoryDutyUnderpaymentConfirmPage, false)
  val postCompensatoryDutyUnderpaymentConfirm: HttpRequestBuilder = buildPostRequest(CompensatoryDutyUnderpaymentConfirmPage)

  val getUnderpaymentSummary: HttpRequestBuilder = buildGetRequest(UnderpaymentSummaryPage)
  val postUnderpaymentSummary: HttpRequestBuilder = buildPostRequest(UnderpaymentSummaryPage, Some(List(("value", "false"))))

}
