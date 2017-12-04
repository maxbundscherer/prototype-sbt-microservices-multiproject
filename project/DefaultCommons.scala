import sbt._
import Keys._

object DefaultCommons {

  object Settings {

    private val myOrganization = "com.mb"
    private val myScalaVersion = "2.12.4"

    def getDefaultSettings(myName: String, myVersion: String): Seq[Def.Setting[_]] = Seq (

      organization  := myOrganization,
      scalaVersion  := myScalaVersion,
      name          := myName,
      version       := myVersion

    )

  }

  object Dependencies {

    private val scalaTestVersion: String      = "3.0.4"
    private val log4jVersion: String          = "1.2.17"
    private val typeSafeConfigVersion: String = "1.3.1"

    private val scalactic   = "org.scalactic" %% "scalactic" % scalaTestVersion
    private val scalatest   = "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
    private val log4j       = "log4j" % "log4j" % log4jVersion
    private val typesafe    = "com.typesafe" % "config" % typeSafeConfigVersion

    def getDefaultDependencies: Seq[ModuleID] = Seq (

      scalactic,
      scalatest,
      log4j,
      typesafe

    )

  }

}
