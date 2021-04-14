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

object IVDRequests extends BaseRequests with Pages {

  val getIndexPage: HttpRequestBuilder =
    http("Initial get after auth to force redirect")
      .get(IndexPage.url)
      .header("Cookie", "mdtp=${mdtpCookie}")
      .check(status.is(303))

  val getUserType: HttpRequestBuilder = buildGetRequest(UserTypePage)
  val postUserTypeImporter: HttpRequestBuilder = buildPostRequest(UserTypePage, Some(List(("value","importer"))))
  val postUserTypeRepresentative: HttpRequestBuilder = buildPostRequest(UserTypePage, Some(List(("value","representative"))))

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

  val getEnterCustomsProcedureCode: HttpRequestBuilder = buildGetRequest(EnterCustomsProcedureCodePage)
  val postEnterCustomsProcedureCode: HttpRequestBuilder = buildPostRequest(EnterCustomsProcedureCodePage, Some(List(("cpc", "1234567"))))

  val getTraderContactDetails: HttpRequestBuilder = buildGetRequest(TraderContactDetailsPage)
  val postTraderContactDetails: HttpRequestBuilder = buildPostRequest(TraderContactDetailsPage,
    Some(List(
      ("fullName", "First last"),
      ("email", "email@email.com"),
      ("phoneNumber", "0123456789"))))

  val getImporterAddress: HttpRequestBuilder = buildGetRequest(ImporterAddressPage)
  val postImporterAddress: HttpRequestBuilder = buildPostRequest(ImporterAddressPage, Some(List(("value", "true"))))

  val getDeferment: HttpRequestBuilder = buildGetRequest(DefermentPage)
  val postDeferment: HttpRequestBuilder = buildPostRequest(DefermentPage, Some(List(("value", "false"))))

  val getSupportingDocumentation: HttpRequestBuilder = buildGetRequest(SupportingDocumentsPage, false)

  val getUploadfile: HttpRequestBuilder = buildGetRequest(UploadFilePage,false)

  val getUploadFileSuccessRedirect: HttpRequestBuilder = buildGetRequest(UploadFileSuccessRedirectPage, false, expectedStatus = 303)

  val getUploadFilePolling: HttpRequestBuilder =  buildGetRequest(UploadFilePollingPage, false, expectedStatus = 303)

  val getUploadAnotherFile: HttpRequestBuilder = buildGetRequest(UploadAnotherFilePage,false)
  val postUploadAnotherFile: HttpRequestBuilder = buildPostRequest(UploadAnotherFilePage, Some(List(("value", "false"))))

  val getRemoveUploadedFile: HttpRequestBuilder = buildGetRequest(RemoveUploadedFilePage,false)
  val postRemoveUploadedFile: HttpRequestBuilder = buildPostRequest(RemoveUploadedFilePage, Some(List(("value", "false"))))

  val getCheckYourAnswers: HttpRequestBuilder = buildGetRequest(CheckYourAnswersPage, false)

  val getConfirmation: HttpRequestBuilder = buildGetRequest(ConfirmationPage, false)

  val getImporterName: HttpRequestBuilder = buildGetRequest(ImporterNamePage,false)
  val postImporterName: HttpRequestBuilder = buildPostRequest(ImporterNamePage,Some(List(("fullName", "Test User"))))

  val getHasFurtherInformation: HttpRequestBuilder = buildGetRequest(HasFurtherInformationPage)
  val postHasFurtherInformation: HttpRequestBuilder = buildPostRequest(HasFurtherInformationPage, Some(List(("value", "true"))))

  val getMoreInformation: HttpRequestBuilder = buildGetRequest(MoreInformationPage)
  val postMoreInformation: HttpRequestBuilder = buildPostRequest(MoreInformationPage, Some(List(("value", "text"))))

  val getImporterEORIExists: HttpRequestBuilder = buildGetRequest(ImporterEORIExistsPage)
  val postImporterEORIExists: HttpRequestBuilder = buildPostRequest(ImporterEORIExistsPage, Some(List(("value", "true"))))

  val getImportersEORINumber: HttpRequestBuilder = buildGetRequest(ImportersEORINumberPage)
  val postImportersEORINumber: HttpRequestBuilder = buildPostRequest(ImportersEORINumberPage, Some(List(("importerEORI", "GB345834921000"))))

  val getConfirmEORINumber: HttpRequestBuilder = buildGetRequest(ConfirmEORINumberPage, false)

  val getImportersDAN: HttpRequestBuilder = buildGetRequest(ImporterDANPage)
  val postImportersDAN: HttpRequestBuilder = buildPostRequest(ImporterDANPage, Some(List(("value", "1234567"))))

  val getSplitPayemnt: HttpRequestBuilder = buildGetRequest(SplitPaymentPage)
  val postSplitPayemnt: HttpRequestBuilder = buildPostRequest(SplitPaymentPage, Some(List(("value", "true"))))

  val getRepresentativeDAN: HttpRequestBuilder = buildGetRequest(RepresentativeDANPage)
  val postRepresentativeDAN: HttpRequestBuilder = buildPostRequest(RepresentativeDANPage, Some(List(
    ("accountNumber" -> "1234567"),
    ("value", "value-3"))))

  val getRepresentativeDANDuty: HttpRequestBuilder = buildGetRequest(RepresentativeDANDutyPage)
  val postRepresentativeDANDuty: HttpRequestBuilder = buildPostRequest(RepresentativeDANDutyPage, Some(List(
    ("accountNumber" -> "1234567"),
    ("value", "value-3"))))

  val getRepresentativeDutySingleAuthorityProofUpload: HttpRequestBuilder = buildGetRequest(RepresentativeUploadProofOfAuthorityPage, false)

  val getRepresentativeDANImportVAT: HttpRequestBuilder = buildGetRequest(RepresentativeDANImportVATPage)
  val postRepresentativeDANImportVAT: HttpRequestBuilder = buildPostRequest(RepresentativeDANImportVATPage, Some(List(
    ("accountNumber" -> "1234567"),
    ("value", "value-3"))))

  val getChangeImportVATUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeImportVATUnderpaymentPage)
  val getRemoveImportVATUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveImportVATUnderpaymentPage)
  val postRemoveImportVATUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveImportVATUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeCustomsDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeCustomsDutyUnderpaymentPage)
  val getRemoveCustomsDutyUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveCustomsDutyUnderpaymentPage)
  val postRemoveCustomsDutyUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveCustomsDutyUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeExciseDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeExciseDutyUnderpaymentPage)
  val getRemoveExciseDutyUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveExciseDutyUnderpaymentPage)
  val postRemoveExciseDutyUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveExciseDutyUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeAdditionalDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeAdditionalDutyUnderpaymentPage)
  val getRemoveAdditionalDutyUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveAdditionalDutyUnderpaymentPage)
  val postRemoveAdditionalDutyUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveAdditionalDutyUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeDefinitiveAddUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeDefinitiveAddUnderpaymentPage)
  val getRemoveDefinitiveAddUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveDefinitiveAddUnderpaymentPage)
  val postRemoveDefinitiveAddUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveDefinitiveAddUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeProvisionalAddUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeProvisionalAddUnderpaymentPage)
  val getRemoveProvisionalAddUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveProvisionalAddUnderpaymentPage)
  val postRemoveProvisionalAddUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveProvisionalAddUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeDefinitiveCountervailingAddUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeDefinitiveCountervailingDutyUnderpaymentPage)
  val getRemoveDefinitiveCountervailingAddUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveDefinitiveCountervailingDutyUnderpaymentPage)
  val postRemoveDefinitiveCountervailingAddUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveDefinitiveCountervailingDutyUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeProvisionalCountervailingAddUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeProvisionalCountervailingDutyUnderpaymentPage)
  val getRemoveProvisionalCountervailingAddUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveProvisionalCountervailingDutyUnderpaymentPage)
  val postRemoveProvisionalCountervailingAddUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveProvisionalCountervailingDutyUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeCustomsDutyAgriculturalProductsUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeCustomsDutyAgriculturalProductsUnderpaymentPage)
  val getRemoveCustomsDutyAgriculturalProductsUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveCustomsDutyAgriculturalProductsUnderpaymentPage)
  val postRemoveCustomsDutyAgriculturalProductsUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveCustomsDutyAgriculturalProductsUnderpaymentPage, Some(List(("value", "true"))))

  val getChangeCompensatoryDutyUnderpayment: HttpRequestBuilder = buildGetRequest(ChangeCompensatoryDutyUnderpaymentPage)
  val getRemoveCompensatoryDutyUnderpayment: HttpRequestBuilder = buildGetRequest(RemoveCompensatoryDutyUnderpaymentPage)
  val postRemoveCompensatoryDutyUnderpayment: HttpRequestBuilder = buildPostRequest(RemoveCompensatoryDutyUnderpaymentPage, Some(List(("value", "true"))))

}
