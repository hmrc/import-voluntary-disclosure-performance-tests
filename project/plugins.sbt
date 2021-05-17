resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "2.14.0")

addSbtPlugin("io.gatling" % "gatling-sbt" % "3.2.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
