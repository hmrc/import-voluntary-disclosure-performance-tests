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

trait Pages extends BaseRequests {

  //Misc Page URLS
  object AuthLoginPage extends Page("/gg-sign-in")

  //Common Routes
  object IndexPage extends Page("", "Index Page")
  object ConfirmEORIPage extends Page("/confirm-eori", "Confirm EORI")
  object WhatDoYouWantToDoPage extends Page("/start-new-or-update", "What Do You Want To Do")
  object DisclosureReferenceNumberPage extends Page("/update-disclosure/reference-number","Disclosure Reference Number")
  object UserTypePage extends Page("/who-is-disclosing", "User Type")
  object NumberOfEntriesPage extends Page("/one-or-more-entries", "Number Of Entries")
  object EntryDetailsPage extends Page("/disclosure/entry-details", "Entry Details")
  object AcceptanceDatePage extends Page("/disclosure/when-entry-acceptance-date", "Acceptance Date")
  object OneCustomsProcedureCodePage extends Page("/disclosure/only-one-cpc", "One Customs Procedure Code")
  object EnterCustomsProcedureCodePage extends Page("/disclosure/enter-cpc", "Enter Customs Procedure Code")
  object TraderContactDetailsPage extends Page("/disclosure/your-contact-details", "Trader Contact Details")
  object DefermentPage extends Page("/disclosure/how-will-you-pay", "Deferment")
  object DocumentsYouMustUploadPage extends Page("/disclosure/mandatory-documents", "Documents You Must Upload")
  object AnyOtherSupportingDocsPage extends Page("/disclosure/further-documents", "Any Other Supporting Documents")
  object WhichDocumentsUploadPage extends Page("/disclosure/which-documents-upload", "Which Documents Upload")
  object ImporterAddressPage extends Page("/disclosure/address-correct", "Importer Address")
  object UploadFilePage extends Page("/disclosure/upload-file", "Upload File")
  object UploadFileBulkPage extends Page("/disclosure/upload-multiple-entry-file", "Upload File Bulk")
  object UploadFileSuccessRedirectPage extends Page(s"/disclosure/upload-file/upscan-response?key=$${upscanKey}", "Upload File Success Redirect")
  object UploadFileBulkSuccessRedirectPage extends Page(s"/disclosure/upload-multiple-entry-file/upscan-response?key=$${upscanKey}", "Upload File Success Redirect")
  object UploadFileCallBackPage extends Page("/internal/call-back-from-upscan", "Upload file Callback Success")
  object UploadFilePollingPage extends Page(s"/disclosure/upload-file/polling?key=$${upscanKey}", "Upload file Polling")
  object UploadAnotherFilePage extends Page("/disclosure/upload-another-file", "Upload Another File")
  object RemoveUploadedFilePage extends Page("/disclosure/confirm-file-removal/1", "Remove Uploaded File")
  object CheckYourAnswersPage extends Page("/disclosure/check-your-answers", "Check Your Answers")
  object ConfirmationPage extends Page("/disclosure/confirmation", "Confirmation Page")
  object BoxGuidancePage extends Page("/disclosure/reason-introduction", "Box Guidance")
  object BoxNumberPage extends Page("/disclosure/box-number", "Box Number")
  object BoxItemLevelPage extends Page("/disclosure/item-number", "Box Item Level")
  object EnterBox22ValuePage extends Page("/disclosure/box-22-currency-total-invoice-amendment", "Enter Box 22")
  object EnterBox33ValuePage extends Page("/disclosure/box-33-commodity-code-amendment", "Enter Box 33")
  object EnterBox34ValuePage extends Page("/disclosure/box-34-origin-country-code-amendment", "Enter Box 34")
  object EnterBox35ValuePage extends Page("/disclosure/box-35-gross-mass-amendment", "Enter Box 35")
  object EnterBox36ValuePage extends Page("/disclosure/box-36-preference-amendment", "Enter Box 36")
  object EnterBox37ValuePage extends Page("/disclosure/box-37-customs-procedure-code-amendment", "Enter Box 37")
  object EnterBox38ValuePage extends Page("/disclosure/box-38-net-mass-amendment", "Enter Box 38")
  object EnterBox39ValuePage extends Page("/disclosure/box-39-quota-amendment", "Enter Box 39")
  object EnterBox41ValuePage extends Page("/disclosure/box-41-supplementary-units-amendment", "Enter Box 41")
  object EnterBox42ValuePage extends Page("/disclosure/box-42-item-price-amendment", "Enter Box 42")
  object EnterBox43ValuePage extends Page("/disclosure/box-43-valuation-method-amendment", "Enter Box 43")
  object EnterBox45ValuePage extends Page("/disclosure/box-45-adjustment-amendment", "Enter Box 45")
  object EnterBox46ValuePage extends Page("/disclosure/box-46-statistical-value-amendment", "Enter Box 46")
  object EnterBox62ValuePage extends Page("/disclosure/box-62-air-transport-costs-amendment", "Enter Box 62")
  object EnterBox63ValuePage extends Page("/disclosure/box-63-awb-freight-costs-amendment", "Enter Box 63")
  object EnterBox66ValuePage extends Page("/disclosure/box-66-insurance-amendment", "Enter Box 66")
  object EnterBox67ValuePage extends Page("/disclosure/box-67-other-charges-deductions-amendment", "Enter Box 67")
  object EnterBox68ValuePage extends Page("/disclosure/box-68-adjustment-vat-value-amendment", "Enter Box 68")
  object UnderpaymentBoxConfirmationPage extends Page("/disclosure/confirm-reason-details", "Box Underpayment Confirmation")
  object BoxReasonSummaryPage extends Page("/disclosure/underpayment-reason-summary", "Box Reason Summary")
  object ChangeBoxReasonPage extends Page("/disclosure/change/change-reason-details", "Change Box Reason")
  def InitialiseChangeBoxReasonPage(box: Int, item: Int) =
    new Page(s"/disclosure/change/change-reason-details/${box}/${item}", s"Initialise Change Box ${box} Reason")
  object RemoveBoxReasonPage extends Page("/disclosure/remove-reason-confirm", "Remove Box Reason")
  object ChangeItemNumberForBoxReasonPage extends Page("/disclosure/change/item-number", "Remove Box Reason")
  object ChangeBox22ValuePage extends Page("/disclosure/change/box-22-currency-total-invoice-amendment", "Change Box 22")
  object ChangeBox33ValuePage extends Page("/disclosure/change/box-33-commodity-code-amendment", "Change Box 33")
  object ChangeBox34ValuePage extends Page("/disclosure/change/box-34-origin-country-code-amendment", "Change Box 34")
  object ChangeBox35ValuePage extends Page("/disclosure/change/box-35-gross-mass-amendment", "Change Box 35")
  object ChangeBox36ValuePage extends Page("/disclosure/change/box-36-preference-amendment", "Change Box 36")
  object ChangeBox37ValuePage extends Page("/disclosure/change/box-37-customs-procedure-code-amendment", "Change Box 37")
  object ChangeBox38ValuePage extends Page("/disclosure/change/box-38-net-mass-amendment", "Change Box 38")
  object ChangeBox39ValuePage extends Page("/disclosure/change/box-39-quota-amendment", "Change Box 39")
  object ChangeBox41ValuePage extends Page("/disclosure/change/box-41-supplementary-units-amendment", "Change Box 41")
  object ChangeBox42ValuePage extends Page("/disclosure/change/box-42-item-price-amendment", "Change Box 42")
  object ChangeBox43ValuePage extends Page("/disclosure/change/box-43-valuation-method-amendment", "Change Box 43")
  object ChangeBox45ValuePage extends Page("/disclosure/change/box-45-adjustment-amendment", "Change Box 45")
  object ChangeBox46ValuePage extends Page("/disclosure/change/box-46-statistical-value-amendment", "Change Box 46")
  object ChangeBox62ValuePage extends Page("/disclosure/change/box-62-air-transport-costs-amendment", "Change Box 62")
  object ChangeBox63ValuePage extends Page("/disclosure/change/box-63-awb-freight-costs-amendment", "Change Box 63")
  object ChangeBox66ValuePage extends Page("/disclosure/change/box-66-insurance-amendment", "Change Box 66")
  object ChangeBox67ValuePage extends Page("/disclosure/change/box-67-other-charges-deductions-amendment", "Change Box 67")
  object ChangeBox68ValuePage extends Page("/disclosure/change/box-68-adjustment-vat-value-amendment", "Change Box 68")
  object ConfirmationBoxChangePage extends Page("/disclosure/change/confirm-reason-details", "Confirm Change Box")
  object HasFurtherInformationPage extends Page("/disclosure/provide-information-option", "Have Further Information")
  object MoreInformationPage extends Page("/disclosure/more-information", "More Information")
  object UnderpaymentIntroductionPage extends Page("/disclosure/underpayment-introduction", "Underpayment Introduction")
  object ImporterDANPage extends Page("/disclosure/importer-deferment-account-number", "Importer Deferment Account Number")
  object UnderpaymentTypePage extends Page("/disclosure/select-duty-type-underpaid", "Underpayment Type")
  object ImportVATUnderpaymentPage extends Page("/disclosure/import-vat-underpayment-details", "Import VAT Underpayment")
  object CustomsDutyUnderpaymentPage extends Page("/disclosure/customs-duty-underpayment-details", "Customs Duty Underpayment")
  object ExciseDutyUnderpaymentPage extends Page("/disclosure/excise-duty-underpayment-details", "Excise Duty Underpayment")
  object AdditionalDutyUnderpaymentPage extends Page("/disclosure/additional-duty-underpayment-details", "Additional Duty Underpayment")
  object DefinitiveDumpingDutyUnderpaymentPage extends Page("/disclosure/definitive-add-underpayment-details", "Definitive Dumping Duty Underpayment")
  object ProvisionalDumpingDutyUnderpaymentPage extends Page("/disclosure/provisional-add-underpayment-details", "Provisional Dumping Duty Underpayment")
  object DefinitiveCountervailingDutyUnderpaymentPage extends Page("/disclosure/definitive-countervailing-duty-underpayment-details", "Definitive Countervailing Duty Underpayment")
  object ProvisionalCountervailingDutyUnderpaymentPage extends Page("/disclosure/provisional-countervailing-duty-underpayment-details", "Provisional Countervailing Duty Underpayment")
  object AgriculturalProductsUnderpaymentPage extends Page("/disclosure/customs-duty-agricultural-products-underpayment-details", "Agricultural Products Underpayment")
  object CompensatoryDutyUnderpaymentPage extends Page("/disclosure/compensatory-duty-underpayment-details", "Compensatory Duty Underpayment")
  object ImportVATUnderpaymentConfirmPage extends Page("/disclosure/confirm-import-vat-underpayment-details?change=false", "Confirm Import VAT Underpayment")
  object CustomsDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-customs-duty-underpayment-details?change=false", "Confirm Customs Duty Underpayment")
  object ExciseDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-excise-duty-underpayment-details?change=false", "Confirm Excise Duty Underpayment")
  object AdditionalDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-additional-duty-underpayment-details?change=false", "Confirm Additional Duty Underpayment")
  object DefinitiveDumpingDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-definitive-add-underpayment-details?change=false", "Confirm Definitive Dumping Duty Underpayment")
  object ProvisionalDumpingDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-provisional-add-underpayment-details?change=false", "Confirm Provisional Dumping Duty Underpayment")
  object DefinitiveCountervailingDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-definitive-countervailing-duty-underpayment-details?change=false", "Confirm Definitive Countervailing Duty Underpayment")
  object ProvisionalCountervailingDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-provisional-countervailing-duty-underpayment-details?change=false", "Confirm Provisional Countervailing Duty Underpayment")
  object AgriculturalProductsUnderpaymentConfirmPage extends Page("/disclosure/confirm-customs-duty-agricultural-products-underpayment-details?change=false", "Confirm Agricultural Products Underpayment")
  object CompensatoryDutyUnderpaymentConfirmPage extends Page("/disclosure/confirm-compensatory-duty-underpayment-details?change=false", "Confirm Compensatory Duty Underpayment")
  object UnderpaymentSummaryPage extends Page("/disclosure/underpayment-amount-summary", "Underpayment Summary")
  object ImporterNamePage extends Page("/disclosure/importer-name", "Importer's Name")
  object ImporterEORIExistsPage extends Page("/disclosure/importer-eori-number-exists","Importer EORI Exists")
  object ImportersEORINumberPage extends Page("/disclosure/importer-eori-number","Importer EORI Number")
  object ConfirmEORINumberPage extends Page("/confirm-eori","Confirm EORI Number")
  object SplitPaymentPage extends Page("/disclosure/split-deferment-payment","Split payments")
  object RepresentativeDANPage extends Page("/disclosure/deferment-account-details-all","Representative Deferment Account Number")
  object RepresentativeDANDutyPage extends Page("/disclosure/deferment-account-details-duties","Representative Deferment Duty Account Number")
  object RepresentativeUploadProofOfAuthorityPage extends Page("/disclosure/upload-deferment-authority/both/1234567","Representative Deferment Duty Single Account Proof Of Authority Upload")
  object RepresentativeDANImportVATPage extends Page("/disclosure/deferment-account-details-vat","Representative Deferment Import VAT Account Number")

  object ChangeImportVATUnderpaymentPage extends Page("/disclosure/change-import-vat-underpayment-details","Change Import VAT Underpayment")
  object RemoveImportVATUnderpaymentPage extends Page("/disclosure/remove-import-vat-underpayment-confirm","Remove Import VAT Underpayment")
  object ChangeCustomsDutyUnderpaymentPage extends Page("/disclosure/change-customs-duty-underpayment-details","Change Customs Duty Underpayment")
  object RemoveCustomsDutyUnderpaymentPage extends Page("/disclosure/remove-customs-duty-underpayment-confirm","Remove Customs Duty Underpayment")
  object ChangeExciseDutyUnderpaymentPage extends Page("/disclosure/change-excise-duty-underpayment-details","Change Excise Duty Underpayment")
  object RemoveExciseDutyUnderpaymentPage extends Page("/disclosure/remove-excise-duty-underpayment-confirm","Remove Excise Duty Underpayment")
  object ChangeAdditionalDutyUnderpaymentPage extends Page("/disclosure/change-additional-duty-underpayment-details","Change Additional Duty Underpayment")
  object RemoveAdditionalDutyUnderpaymentPage extends Page("/disclosure/remove-additional-duty-underpayment-confirm","Remove Additional Duty Underpayment")
  object ChangeDefinitiveAddUnderpaymentPage extends Page("/disclosure/change-definitive-add-underpayment-details","Change Definitive Add Underpayment")
  object RemoveDefinitiveAddUnderpaymentPage extends Page("/disclosure/remove-definitive-add-underpayment-confirm","Remove Definitive Add Underpayment")
  object ChangeProvisionalAddUnderpaymentPage extends Page("/disclosure/change-provisional-add-underpayment-details","Change Provisional Add Underpayment")
  object RemoveProvisionalAddUnderpaymentPage extends Page("/disclosure/remove-provisional-add-underpayment-confirm","Remove Provisional Add Underpayment")
  object ChangeDefinitiveCountervailingDutyUnderpaymentPage extends Page("/disclosure/change-definitive-countervailing-duty-underpayment-details","Change Definitive Countervailing Duty Underpayment")
  object RemoveDefinitiveCountervailingDutyUnderpaymentPage extends Page("/disclosure/remove-definitive-countervailing-duty-underpayment-confirm","Remove Definitive Countervailing Duty Underpayment")
  object ChangeProvisionalCountervailingDutyUnderpaymentPage extends Page("/disclosure/change-provisional-countervailing-duty-underpayment-details","Change Provisional Countervailing Duty Underpayment")
  object RemoveProvisionalCountervailingDutyUnderpaymentPage extends Page("/disclosure/remove-provisional-countervailing-duty-underpayment-confirm","Remove Provisional Countervailing Duty Underpayment")
  object ChangeCustomsDutyAgriculturalProductsUnderpaymentPage extends Page("/disclosure/change-customs-duty-agricultural-products-underpayment-details","Change Customs Duty Agricultural Products Underpayment")
  object RemoveCustomsDutyAgriculturalProductsUnderpaymentPage extends Page("/disclosure/remove-customs-duty-agricultural-products-underpayment-confirm","Remove Customs Duty Agricultural Products Underpayment")
  object ChangeCompensatoryDutyUnderpaymentPage extends Page("/disclosure/change-compensatory-duty-underpayment-details","Change Compensatory Duty Underpayment")
  object RemoveCompensatoryDutyUnderpaymentPage extends Page("/disclosure/remove-compensatory-duty-underpayment-confirm","Remove Compensatory Duty Underpayment")
  object ImportersAddressLookupPage extends Page("/importer-address-callback?id=12345","Importers Address Lookup")
  object ImporterVATRegisteredPage extends Page("/disclosure/importer-vat-registered","Importer VAT Registered")

}
