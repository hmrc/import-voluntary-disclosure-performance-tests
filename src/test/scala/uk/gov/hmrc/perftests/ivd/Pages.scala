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
  object AcceptanceDatePage extends Page("/disclosure/when-entry-acceptance-date", "Acceptance Date")

}
