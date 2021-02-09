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

}
