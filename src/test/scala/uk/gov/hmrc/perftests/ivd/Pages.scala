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
  object UserTypePage extends Page("/who-is-disclosing", "User Type")
  object NumberOfEntriesPage extends Page("/one-or-more-entries", "Number Of Entries")
  object EntryDetailsPage extends Page("/disclosure/entry-details", "Entry Details")
  object AcceptanceDatePage extends Page("/disclosure/when-entry-acceptance-date", "Acceptance Date")
  object EnterCustomsProcedureCodePage extends Page("/disclosure/enter-cpc", "Enter Customs Procedure Code")
  object CustomsProcedureCodePage extends Page("/disclosure/has-cpc-changed", "Customs Procedure Code")
  object UnderpaymentTypePage extends Page("/disclosure/what-duty-type-underpaid", "Underpayment Type")
  object CustomsDutyPage extends Page("/disclosure/customs-duty-details", "Customs Duty")
  object ImportVATPage extends Page("/disclosure/import-vat-details", "Import VAT")
  object ExciseDutyDetailsPage extends Page("/disclosure/excise-duty-details", "Excise Duty Details")
  object UnderpaymentSummaryPage extends Page("/disclosure/underpayment-amount-summary", "Underpayment Summary")
  object TraderContactDetailsPage extends Page("/disclosure/importer-contact-details", "Trader Contact Details")
  object DefermentPage extends Page("/disclosure/paying-by-deferment", "Deferment")
  object SupportingDocumentsPage extends Page("/disclosure/supporting-documentation-format", "Supporting Documentation Formats Info")
  object ImporterAddressPage extends Page("/disclosure/importer-address", "Importer Address")
  object UploadFilePage extends Page("/disclosure/upload-file", "Upload File")
  object UploadFileSuccessRedirectPage extends Page(s"/disclosure/upload-file/upscan-response?key=$${upscanKey}", "Upload File Success Redirect")
  object UploadFileCallBackPage extends Page("/internal/call-back-from-upscan", "Upload file Callback Success")
  object UploadFilePollingPage extends Page(s"/disclosure/upload-file/polling?key=$${upscanKey}", "Upload file Polling")
  object UploadAnotherFilePage extends Page("/disclosure/upload-another-file", "Upload Another File")
  object RemoveUploadedFilePage extends Page("/disclosure/remove-file/1", "Remove Uploaded File")
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

}
