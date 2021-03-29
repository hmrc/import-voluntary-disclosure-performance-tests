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
import uk.gov.hmrc.perftests.ivd.UpscanRequests._

class IVDSimulation extends PerformanceTestRunner {

  setup("auth", "Auth login")
    .withRequests(getAuthLogin, authLogin)

  setup("importerSectionTwo", "Importer Flow Section 2 - Entry Details")
    .withRequests(
      getIndexPage,
      getUserType,
      postUserTypeImporter,
      getNumberOfEntries,
      postNumberOfEntries,
      getEntryDetails,
      postEntryDetails,
      getAcceptanceDate,
      postAcceptanceDate,
      getEnterCustomsProcedureCode,
      postEnterCustomsProcedureCode,
    )

  setup("importerSectionThree", "Importer Flow Section 3 - Underpayment Amount")
    .withRequests(
      getUnderpaymentIntroduction,
      getUnderpaymentType,
      postUnderpaymentType,
      getCustomsDuty,
      postCustomsDuty,
      getImportVAT,
      postImportVAT,
      getExciseDutyDetails,
      postExciseDutyDetails,
      getUnderpaymentSummary,
    )

  setup("importerSectionFour", "Importer Flow Section 4 - Underpayment Reasons")
    .withRequests(
      getBoxGuidancePage,
      //TODO - Box 22
      getBoxNumber,
      postBoxNumber22,
      getEnterBox22ValuePage,
      postEnterBox22ValuePage,
      //TODO - Box 33
      getBoxNumber,
      postBoxNumber33,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox33ValuePage,
      postEnterBox33ValuePage,
      //TODO - Box 34
      getBoxNumber,
      postBoxNumber34,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox34ValuePage,
      postEnterBox34ValuePage,
      //TODO - Box 35
      getBoxNumber,
      postBoxNumber35,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox35ValuePage,
      postEnterBox35ValuePage,
      //TODO - Box 36
      getBoxNumber,
      postBoxNumber36,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox36ValuePage,
      postEnterBox36ValuePage,
      //TODO - Box 37
      getBoxNumber,
      postBoxNumber37,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox37ValuePage,
      postEnterBox37ValuePage,
      //TODO - Box 38
      getBoxNumber,
      postBoxNumber38,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox38ValuePage,
      postEnterBox38ValuePage,
      //TODO - Box 39
      getBoxNumber,
      postBoxNumber39,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox39ValuePage,
      postEnterBox39ValuePage,
      //TODO - Box 41
      getBoxNumber,
      postBoxNumber41,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox41ValuePage,
      postEnterBox41ValuePage,
      //TODO - Box 42
      getBoxNumber,
      postBoxNumber42,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox42ValuePage,
      postEnterBox42ValuePage,
      //TODO - Box 43
      getBoxNumber,
      postBoxNumber43,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox43ValuePage,
      postEnterBox43ValuePage,
      //TODO - Box 45
      getBoxNumber,
      postBoxNumber45,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox45ValuePage,
      postEnterBox45ValuePage,
      //TODO - Box 46
      getBoxNumber,
      postBoxNumber46,
      getBoxItemLevel,
      postBoxItemLevel,
      getEnterBox46ValuePage,
      postEnterBox46ValuePage,
      //TODO - Box 62
      getBoxNumber,
      postBoxNumber62,
      getEnterBox62ValuePage,
      postEnterBox62ValuePage,
      //TODO - Box 63
      getBoxNumber,
      postBoxNumber63,
      getEnterBox63ValuePage,
      postEnterBox63ValuePage,
      //TODO - Box 66
      getBoxNumber,
      postBoxNumber66,
      getEnterBox66ValuePage,
      postEnterBox66ValuePage,
      //TODO - Box 67
      getBoxNumber,
      postBoxNumber67,
      getEnterBox67ValuePage,
      postEnterBox67ValuePage,
      //TODO - Box 68
      getBoxNumber,
      postBoxNumber68,
      getEnterBox68ValuePage,
      postEnterBox68ValuePage,
      getUnderpaymentBoxConfirmationPage,
      postUnderpaymentBoxConfirmationPage,
      getBoxReasonSummary,
      postBoxReasonSummary,
      getHasFurtherInformation,
      postHasFurtherInformation,
      getMoreInformation,
      postMoreInformation,
      getConfirmEORINumber
    )

  setup("importerSectionFive", "Importer Flow Section 5 - Upload File")
    .withRequests(
      getSupportingDocumentation,
      getUploadfile,
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
      postDeferment,
      getImportersDAN,
      postImportersDAN
    )

  setup("importerSectionEight", "Importer Flow Section 8 - CYA and Submit")
    .withRequests(
      getCheckYourAnswers,
      getConfirmation
    )

  setup("representativeSectionTwo", "Representative Flow Section 2 - Entry Details")
    .withRequests(
      getIndexPage,
      getUserType,
      postUserTypeRepresentative,
      getImporterName,
      postImporterName,
      getImporterEORIExists,
      postImporterEORIExists,
      getImportersEORINumber,
      postImportersEORINumber
    )

  setup("representativeSectionSeven", "Representative Flow Section 7 - Payment Information")
    .withRequests(
      getSplitPayemnt,
      postSplitPayemnt,
      getRepresentativeDAN,
      postRepresentativeDAN,
      getRepresentativeDANDuty,
      postRepresentativeDANDuty,
      getRepresentativeDANImportVAT,
      postRepresentativeDANImportVAT
    )

  runSimulation()
}
