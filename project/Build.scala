import sbt._
import sbt.Defaults.defaultSettings
import Keys._

object MyTestBuild extends Build {

  final val StandardSettings = defaultSettings ++ Seq(
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    retrieveManaged in ThisBuild := true
  )

  lazy val testMain = Project(
    id = "test",
    base = file("."),
    settings =  StandardSettings ++ Seq(
      description := "Main app"
    )
  )
}
