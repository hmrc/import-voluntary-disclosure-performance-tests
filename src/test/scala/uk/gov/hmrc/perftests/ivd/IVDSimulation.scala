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

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import uk.gov.hmrc.perftests.ivd.AuthSessionRequests._
import uk.gov.hmrc.perftests.ivd.BoxUnderpaymentsRequests._
import uk.gov.hmrc.perftests.ivd.IVDRequests._
import uk.gov.hmrc.perftests.ivd.UnderpaymentsRequests._
import uk.gov.hmrc.perftests.ivd.UpscanRequests._

class IVDSimulation extends PerformanceTestRunner {

  setup("auth", "Auth login")
    .withRequests(getAuthLogin, authLogin)

  setup("importerSectionTwo", "Importer Flow Section 2 - Entry Details")
    .withRequests(
      getIndexPage,
      getConfirmEORI,
      getWhatDoYouWantToDo,
      postStartNewDisclosure,
      getUserType,
      postUserTypeImporter,
      getNumberOfEntries,
      postNumberOfEntries,
      getEntryDetails,
      postEntryDetails,
      getAcceptanceDate,
      postAcceptanceDate,
      getOneCustomsProcedureCode,
      postOneCustomsProcedureCode,
      getEnterCustomsProcedureCode,
      postEnterCustomsProcedureCode,
    )

  setup("importerSectionThree", "Importer Flow Section 3 - Underpayment Amount")
    .withRequests(
      getUnderpaymentIntroduction,
      //TODO - Import VAT Underpayment Type
      getUnderpaymentType,
      postImportVATDutyType,
      getImportVATUnderpayment,
      postImportVATUnderpayment,
      getImportVATUnderpaymentConfirm,
      postImportVATUnderpaymentConfirm,
      getChangeImportVATUnderpayment,
      getRemoveImportVATUnderpayment,
      postRemoveImportVATUnderpayment,
      //TODO - Customs Duty Underpayment Type
      getUnderpaymentType,
      postCustomsDutyType,
      getCustomsDutyUnderpayment,
      postCustomsDutyUnderpayment,
      getCustomsDutyUnderpaymentConfirm,
      postCustomsDutyUnderpaymentConfirm,
      getChangeCustomsDutyUnderpayment,
      getRemoveCustomsDutyUnderpayment,
      postRemoveCustomsDutyUnderpayment,
      //TODO - Excise Duty Underpayment Type
      getUnderpaymentType,
      postExciseDutyType,
      getExciseDutyUnderpayment,
      postExciseDutyUnderpayment,
      getExciseDutyUnderpaymentConfirm,
      postExciseDutyUnderpaymentConfirm,
      getChangeExciseDutyUnderpayment,
      getRemoveExciseDutyUnderpayment,
      postRemoveExciseDutyUnderpayment,
      //TODO - Additional VAT Underpayment Type
      getUnderpaymentType,
      postAdditionalDutyType,
      getAdditionalDutyUnderpayment,
      postAdditionalDutyUnderpayment,
      getAdditionalDutyUnderpaymentConfirm,
      postAdditionalDutyUnderpaymentConfirm,
      getChangeAdditionalDutyUnderpayment,
      getRemoveAdditionalDutyUnderpayment,
      postRemoveAdditionalDutyUnderpayment,
      //TODO - Definitive Dumping Duty Underpayment Type
      getUnderpaymentType,
      postDefinitiveDumpingDutyType,
      getDefinitiveDumpingDutyUnderpayment,
      postDefinitiveDumpingDutyUnderpayment,
      getDefinitiveDumpingDutyUnderpaymentConfirm,
      postDefinitiveDumpingDutyUnderpaymentConfirm,
      getChangeDefinitiveAddUnderpayment,
      getRemoveDefinitiveAddUnderpayment,
      postRemoveDefinitiveAddUnderpayment,
      //TODO - Provisional Dumping Duty Underpayment Type
      getUnderpaymentType,
      postProvisionalDumpingDutyType,
      getProvisionalDumpingDutyUnderpayment,
      postProvisionalDumpingDutyUnderpayment,
      getProvisionalDumpingDutyUnderpaymentConfirm,
      postProvisionalDumpingDutyUnderpaymentConfirm,
      getChangeProvisionalAddUnderpayment,
      getRemoveProvisionalAddUnderpayment,
      postRemoveProvisionalAddUnderpayment,
      //TODO - Definitive Countervailing Duty Underpayment Type
      postDefinitiveCountervailingDutyType,
      getDefinitiveCountervailingDutyUnderpayment,
      postDefinitiveCountervailingDutyUnderpayment,
      getDefinitiveCountervailingDutyUnderpaymentConfirm,
      postDefinitiveCountervailingDutyUnderpaymentConfirm,
      getChangeDefinitiveCountervailingAddUnderpayment,
      getRemoveDefinitiveCountervailingAddUnderpayment,
      postRemoveDefinitiveCountervailingAddUnderpayment,
      //TODO - Provisional Countervailing Duty Underpayment Type
      getUnderpaymentType,
      postProvisionalCountervailingDutyType,
      getProvisionalCountervailingDutyUnderpayment,
      postProvisionalCountervailingDutyUnderpayment,
      getProvisionalCountervailingDutyUnderpaymentConfirm,
      postProvisionalCountervailingDutyUnderpaymentConfirm,
      getChangeProvisionalCountervailingAddUnderpayment,
      getRemoveProvisionalCountervailingAddUnderpayment,
      postRemoveProvisionalCountervailingAddUnderpayment,
      //TODO - Agricultural Products Underpayment Type
      getUnderpaymentType,
      postAgriculturalProductsType,
      getAgriculturalProductsUnderpayment,
      postAgriculturalProductsUnderpayment,
      getAgriculturalProductsUnderpaymentConfirm,
      postAgriculturalProductsUnderpaymentConfirm,
      getChangeCustomsDutyAgriculturalProductsUnderpayment,
      getRemoveCustomsDutyAgriculturalProductsUnderpayment,
      postRemoveCustomsDutyAgriculturalProductsUnderpayment,
      //TODO - Compensatory Duty Underpayment Type
      getUnderpaymentType,
      postCompensatoryDutyType,
      getCompensatoryDutyUnderpayment,
      postCompensatoryDutyUnderpayment,
      getCompensatoryDutyUnderpaymentConfirm,
      postCompensatoryDutyUnderpaymentConfirm,
      getChangeCompensatoryDutyUnderpayment,
      getRemoveCompensatoryDutyUnderpayment,
      postRemoveCompensatoryDutyUnderpayment,
      //TODO - Adding Import VAT to continue journey
      getUnderpaymentType,
      postImportVATDutyType,
      getImportVATUnderpayment,
      postImportVATUnderpayment,
      getImportVATUnderpaymentConfirm,
      postImportVATUnderpaymentConfirm,
      getUnderpaymentSummary,
      postUnderpaymentSummary
    )

  setup("importerSectionFour", "Importer Flow Section 4 - Underpayment Reasons")
    .withRequests(
      getBoxGuidancePage,
      //TODO - Box 22
      getBoxNumber,
      postBoxNumber22,
      getEnterBox22ValuePage,
      postEnterBox22ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 33
      getBoxNumber,
      postBoxNumber33,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox33ValuePage,
      postEnterBox33ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 34
      getBoxNumber,
      postBoxNumber34,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox34ValuePage,
      postEnterBox34ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 35
      getBoxNumber,
      postBoxNumber35,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox35ValuePage,
      postEnterBox35ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 36
      getBoxNumber,
      postBoxNumber36,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox36ValuePage,
      postEnterBox36ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 37
      getBoxNumber,
      postBoxNumber37,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox37ValuePage,
      postEnterBox37ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 38
      getBoxNumber,
      postBoxNumber38,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox38ValuePage,
      postEnterBox38ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 39
      getBoxNumber,
      postBoxNumber39,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox39ValuePage,
      postEnterBox39ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 41
      getBoxNumber,
      postBoxNumber41,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox41ValuePage,
      postEnterBox41ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      getBoxReasonSummary,
      postBoxReasonSummary,
      // Change Box reasons
      getInitialiseChangeBox22Reason,
      getChangeBoxReason,
      getRemoveBoxReason,
      postRemoveBoxReason,
      getChangeBox22ValuePage,
      postChangeBox22ValuePage,
      getInitialiseChangeBox33Reason,
      getChangeBoxReason,
      getItemNumberForBoxReason,
      postItemNumberForBoxReason,
      getChangeBox33ValuePage,
      postChangeBox33ValuePage,
      getInitialiseChangeBox34Reason,
      getChangeBox34ValuePage,
      postChangeBox34ValuePage,
      getInitialiseChangeBox35Reason,
      getChangeBox35ValuePage,
      postChangeBox35ValuePage,
      getInitialiseChangeBox36Reason,
      getChangeBox36ValuePage,
      postChangeBox36ValuePage,
      getInitialiseChangeBox37Reason,
      getChangeBox37ValuePage,
      postChangeBox37ValuePage,
      getInitialiseChangeBox38Reason,
      getChangeBox38ValuePage,
      postChangeBox38ValuePage,
      getInitialiseChangeBox39Reason,
      getChangeBox39ValuePage,
      postChangeBox39ValuePage,
      getInitialiseChangeBox41Reason,
      getChangeBox41ValuePage,
      postChangeBox41ValuePage,
      getConfirmationBoxChangePage,
      postConfirmationBoxChangePage,
      getHasFurtherInformation,
      postHasFurtherInformation,
      getMoreInformation,
      postMoreInformation
    )

  setup("importerSectionFive", "Importer Flow Section 5 - Upload File")
    .withRequests(
      getDocumentsYouMustUpload,
      getAnyOtherSupportingDocs,
      postAnyOtherSupportingDocs,
      getUploadFile,
      getUploadFileSuccessRedirect,
      upscanPost,
      getUploadFilePolling,
      getUploadAnotherFile,
      postUploadAnotherFile,
      getRemoveUploadedFile,
      postRemoveUploadedFile,
    )

  setup("importerSectionSix", "Importer Flow Section 6 - Contact Details")
    .withRequests(
      getTraderContactDetails,
      postTraderContactDetails,
      getImporterAddress,
      postImporterAddress,
    )

  setup("importerSectionSeven", "Importer Flow Section 7 - Payment Information")
    .withRequests(
      getDeferment,
      postDefermentByOther,
      getImportersDAN,
      postImportersDAN
    )

  setup("importerSectionEight", "Importer Flow Section 8 - CYA and Submit")
    .withRequests(
      getCheckYourAnswers,
      getConfirmation
    )

  setup("representativeSectionTwo", "aaaa")
    .withRequests(
      getIndexPage,
      getConfirmEORI,
      getWhatDoYouWantToDo,
      postStartNewDisclosure,
      getUserType,
      postUserTypeRepresentative,
      getImporterName,
      postImporterName,
      getImportersAddress,
      getImporterEORIExists,
      postImporterEORIExists,
      getImportersEORINumber,
      postImportersEORINumber,
      getImporterVATRegistered,
      postImporterVATRegistered,
      getNumberOfEntries,
      postNumberOfEntries,
      getEntryDetails,
      postEntryDetails,
      getAcceptanceDate,
      postAcceptanceDate,
      getOneCustomsProcedureCode,
      postOneCustomsProcedureCode,
      getEnterCustomsProcedureCode,
      postEnterCustomsProcedureCode
    )

  setup("representativeSectionThree", "Representative Flow Section 3 - Underpayment Amount")
    .withRequests(
      getUnderpaymentIntroduction,
      //TODO - Import VAT Underpayment Type
      getUnderpaymentType,
      postImportVATDutyType,
      getImportVATUnderpayment,
      postImportVATUnderpayment,
      getImportVATUnderpaymentConfirm,
      postImportVATUnderpaymentConfirm,
      getUnderpaymentSummary,
      postUnderpaymentSummaryAddAnother,
      //TODO - Customs Duty Underpayment Type
      getUnderpaymentType,
      postCustomsDutyType,
      getCustomsDutyUnderpayment,
      postCustomsDutyUnderpayment,
      getCustomsDutyUnderpaymentConfirm,
      postCustomsDutyUnderpaymentConfirm,
      getUnderpaymentSummary,
      postUnderpaymentSummary
    )

  setup("representativeSectionFour", "Representative Flow Section 4 - Underpayment Reasons")
    .withRequests(
      getBoxGuidancePage,
      //TODO - Box 22
      getBoxNumber,
      postBoxNumber22,
      getEnterBox22ValuePage,
      postEnterBox22ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 42
      getBoxNumber,
      postBoxNumber42,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox42ValuePage,
      postEnterBox42ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 43
      getBoxNumber,
      postBoxNumber43,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox43ValuePage,
      postEnterBox43ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 45
      getBoxNumber,
      postBoxNumber45,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox45ValuePage,
      postEnterBox45ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 46
      getBoxNumber,
      postBoxNumber46,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox46ValuePage,
      postEnterBox46ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 62
      getBoxNumber,
      postBoxNumber62,
      getEnterBox62ValuePage,
      postEnterBox62ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 63
      getBoxNumber,
      postBoxNumber63,
      getEnterBox63ValuePage,
      postEnterBox63ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 66
      getBoxNumber,
      postBoxNumber66,
      getEnterBox66ValuePage,
      postEnterBox66ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 67
      getBoxNumber,
      postBoxNumber67,
      getEnterBox67ValuePage,
      postEnterBox67ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      //TODO - Box 68
      getBoxNumber,
      postBoxNumber68,
      getEnterBox68ValuePage,
      postEnterBox68ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      getInitialiseChangeBox42Reason,
      getChangeBox42ValuePage,
      postChangeBox42ValuePage,
      getInitialiseChangeBox43Reason,
      getChangeBox43ValuePage,
      postChangeBox43ValuePage,
      getInitialiseChangeBox45Reason,
      getChangeBox45ValuePage,
      postChangeBox45ValuePage,
      getInitialiseChangeBox46Reason,
      getChangeBox46ValuePage,
      postChangeBox46ValuePage,
      getInitialiseChangeBox62Reason,
      getChangeBox62ValuePage,
      postChangeBox62ValuePage,
      getInitialiseChangeBox63Reason,
      getChangeBox63ValuePage,
      postChangeBox63ValuePage,
      getInitialiseChangeBox66Reason,
      getChangeBox66ValuePage,
      postChangeBox66ValuePage,
      getInitialiseChangeBox67Reason,
      getChangeBox67ValuePage,
      postChangeBox67ValuePage,
      getInitialiseChangeBox68Reason,
      getChangeBox68ValuePage,
      postChangeBox68ValuePage,
      getHasFurtherInformation,
      postHasFurtherInformation,
      getMoreInformation,
      postMoreInformation
    )

  setup("representativeSectionFive", "Representative Flow Section 5 - Upload File")
    .withRequests(
      getDocumentsYouMustUpload,
      getAnyOtherSupportingDocs,
      postAnyOtherSupportingDocs,
      getWhichDocumentsUpload,
      postWhichDocumentsUpload,
      getUploadFile,
      getUploadFileSuccessRedirect,
      upscanPost,
      getUploadFilePolling,
      getUploadAnotherFile,
      postUploadAnotherFile,
      getRemoveUploadedFile,
      postRemoveUploadedFile,
    )

  setup("representativeSectionSix", "Representative Flow Section 6 - Contact Details")
    .withRequests(
      getTraderContactDetails,
      postTraderContactDetails,
      getImporterAddress,
      postImporterAddress,
    )

  setup("representativeSectionSeven", "Representative Flow Section 7 - Payment Information")
    .withRequests(
      getDeferment,
      postDefermentByDeferment,
      getSplitPayemnt,
      postSplitPayemnt,
      getRepresentativeDANDuty,
      postRepresentativeDANDuty,
      getRepresentativeDutySingleAuthorityProofUpload,
      getRepresentativeDANImportVAT,
      postRepresentativeDANImportVAT
    )

  setup("representativeSectionEight", "Representative Flow Section 8 - CYA and Submit")
    .withRequests(
      getCheckYourAnswers,
      getConfirmation
    )

  setup("bulkEntry", "Bulk Entry flow")
    .withRequests(
      getIndexPage,
      getConfirmEORI,
      getWhatDoYouWantToDo,
      postStartNewDisclosure,
      getUserType,
      postUserTypeImporter,
      getNumberOfEntries,
      postNumberOfEntriesBulk,
      getAcceptanceDate,
      postAcceptanceDate,
      getUnderpaymentIntroduction,
      getUnderpaymentType,
      postImportVATDutyType,
      getImportVATUnderpayment,
      postImportVATUnderpayment,
      getImportVATUnderpaymentConfirm,
      postImportVATUnderpaymentConfirm,
      getUnderpaymentSummary,
      postUnderpaymentSummary,
      getUploadFileBulk,
      getUploadFileBulkSuccessRedirect,
      upscanPost,
      getUploadFilePolling,
      getMoreInformation,
      postMoreInformation,
      getTraderContactDetails,
      postTraderContactDetails,
      getImporterAddress,
      postImporterAddress,
      getDeferment,
      postDefermentByOther,
      getCheckYourAnswers,
      getConfirmation
    )

  setup("updateCase", "Update Case flow")
    .withRequests(
      getIndexPage,
      getConfirmEORI,
      getWhatDoYouWantToDo,
      postUpdateExistingDisclosure,
      getDisclosureReferenceNumber,
      postDisclosureReferenceNumber,
      getSendMoreDocumentation,
      postSendMoreDocumentation
    )

    runSimulation()
}
