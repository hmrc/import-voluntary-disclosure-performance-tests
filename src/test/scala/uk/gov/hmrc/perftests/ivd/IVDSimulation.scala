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
import uk.gov.hmrc.perftests.ivd.IVDRequests.{getBoxNumber, getRemoveUploadedFile, _}
import uk.gov.hmrc.perftests.ivd.UpscanRequests.upscanPost

class IVDSimulation extends PerformanceTestRunner {

  setup("auth", "Auth login")
    .withRequests(getAuthLogin, authLogin)

  setup("importVoluntaryDisclosure", "Import Voluntary Disclosure")
    .withRequests(
      getIndexPage,
      getUserType,
      postUserType,
      getNumberOfEntries,
      postNumberOfEntries,
      getEntryDetails,
      postEntryDetails,
      getAcceptanceDate,
      postAcceptanceDate,
      getEnterCustomsProcedureCode,
      postEnterCustomsProcedureCode,
      getCustomsProcedureCode,
      postCustomsProcedureCode,
      getUnderpaymentType,
      postUnderpaymentType,
      getCustomsDuty,
      postCustomsDuty,
      getImportVAT,
      postImportVAT,
      getExciseDutyDetails,
      postExciseDutyDetails,
      getUnderpaymentSummary,
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
      //getBoxNumber,
      //postBoxNumber34,
      //getBoxItemLevel,
      //postBoxItemLevel,
      //getEnterBox34ValuePage,
      //postEnterBox34ValuePage,
      //TODO - Box 37
      //getBoxNumber,
      //postBoxNumber37,
      //getBoxItemLevel,
      //postBoxItemLevel,
      //getEnterBox37ValuePage,
      //postEnterBox37ValuePage,
      //TODO - Box 39
      //getBoxNumber,
      //postBoxNumber39,
      //getBoxItemLevel,
      //postBoxItemLevel,
      //getEnterBox39ValuePage,
      //postEnterBox39ValuePage,
      //TODO - Box 45
      //getBoxNumber,
      //postBoxNumber45,
      //getBoxItemLevel,
      //postBoxItemLevel,
      //getEnterBox45ValuePage,
      //postEnterBox45ValuePage,
      //TODO - Box 62
      getBoxNumber,
      postBoxNumber62,
      getEnterBox62ValuePage,
      postEnterBox62ValuePage,
      //TODO - Box 63
      //getBoxNumber,
      //postBoxNumber63,
      //getEnterBox63ValuePage,
      //postEnterBox63ValuePage,
      //TODO - Box 66
      //getBoxNumber,
      //postBoxNumber66,
      //getEnterBox66ValuePage,
      //postEnterBox66ValuePage,
      //TODO - Box 67
      //getBoxNumber,
      //postBoxNumber67,
      //getEnterBox67ValuePage,
      //postEnterBox67ValuePage,
      //TODO - Box 68
      //getBoxNumber,
      //postBoxNumber68,
      //getEnterBox68ValuePage,
      //postEnterBox68ValuePage
      getSupportingDocumentation,
      getUploadfile,
      getUploadFileSuccessRedirect,
      upscanPost,
      getUploadFilePolling,
      getUploadAnotherFile,
      postUploadAnotherFile,
      getRemoveUploadedFile,
      postRemoveUploadedFile,
      getTraderContactDetails,
      postTraderContactDetails,
      getImporterAddress,
      postImporterAddress,
      getDeferment,
      postDeferment,
      getCheckYourAnswers,
      getConfirmation
    )

  runSimulation()
}
