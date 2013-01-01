import sbt._
import sbt.Defaults.defaultSettings
import Keys._

object MyTestBuild extends Build {

  // Compiler flag
  final val StandardSettings = defaultSettings ++ Seq(
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    retrieveManaged in ThisBuild := true
  )

  // The default project
  lazy val testMain = Project(
    id = "test",
    base = file("."),
    settings =  StandardSettings ++ Seq(
      description := "Main app"

      // The following line will enable additional components if you remove the //
      // ,libraryDependencies ++= scalazComponents ++ apacheHttpComponents ++ pdfBoxComponents ++ h2DBComponents ++ posgresDBComponents

      // Uncomment to enable additional download sites. Required by some components.
      // ,resolvers ++= ExtraResolvers
    )
  )


  // Additional components ----------

  // Scalaz https://github.com/scalaz/scalaz
  // From http://repo1.maven.org/maven2/org/scalaz
  // Use import scalaz._; import Scalaz._
  lazy val scalaz = "org.scalaz" %% "scalaz-core" % "6.0.4" // cross CrossVersion.full
  lazy val scalazComponents = Seq( scalaz )


  // Apache HttpComponents http://hc.apache.org/
  // From http://central.maven.org/maven2/org/apache/httpcomponents/
  // Use: import org.apache.http.client.methods.HttpGet
  lazy val apacheHttpClient = "org.apache.httpcomponents" % "httpclient" % "4.2.2"
  lazy val apacheHttpMime   = "org.apache.httpcomponents" % "httpmime"   % "4.2.2"
  lazy val apacheHttpComponents = Seq( apacheHttpClient, apacheHttpMime )

  
  // Apache PDFBox http://pdfbox.apache.org/
  // From http://repo1.maven.org/maven2/org/apache/pdfbox/pdfbox/
  lazy val pdfBox = "org.apache.pdfbox" % "pdfbox" % "1.7.1"
  lazy val pdfBoxComponents = Seq( pdfBox )


  // H2DB
  // From http://repo1.maven.org/maven2/com/h2database/h2/
  lazy val h2DB = "com.h2database" % "h2" % "1.3.170" // % "provided"
  lazy val h2DBComponents = Seq( h2DB )


  // PostgreSQL	
	// From http://repo1.maven.org/maven2/postgresql/postgresql/
  lazy val posgresDB = "postgresql" % "postgresql" % "9.1-901.jdbc4" // % "provided" 
  lazy val posgresDBComponents = Seq( posgresDB )


  // Others
  // lazy val servlet_api  = "javax.servlet" % "servlet-api" % "2.5" % "provided" withSources
  // lazy val jetty        = "org.mortbay.jetty" % "jetty" % "6.1.25" % "container" withSources
  // lazy val jopt         = "net.sf.jopt-simple" % "jopt-simple" % "4.4-beta-3" withSources()
  // lazy val opencsv      = "net.sf.opencsv" % "opencsv" % "2.3" // from Sonatype
  // lazy val logback      = "ch.qos.logback" % "logback-classic" % "0.9.26" withSources
  // lazy val bouncycastle = "org.bouncycastle"  % "bcprov-jdk16" % "1.46"  withSources,
  // lazy val junitInterf  = "com.novocode" % "junit-interface" % "0.8" % "test->default"
  // lazy val jgeocoder    = "net.sourceforge.jgeocoder" % "jgeocoder" % "0.4.1" withSources // from Drexel
  // lazy val poi          = "org.apache.poi" % "poi" % "3.8" withSources
  // lazy val apacheIO     = "commons-io" % "commons-io" % "2.4" // org.apache.commons http://commons.apache.org/io/
  // lazy val specs        = "org.scala-tools.testing" %% "specs" % "1.6.5-SNAPSHOT" % "test" withSources
  // lazy val scalacheck   = "org.scala-tools.testing" %% "scalacheck" % "1.8-SNAPSHOT" % "test" withSources


  // Additional repos
  final val ExtraResolvers = Seq(
    // For geocoder jar at http://jgeocoder.sourceforge.net/
    "Drexel" at "https://www.cs.drexel.edu/~zl25/maven2/repo",

    // Scala-tools.org substitute
    "SonaScalaTools" at "http://oss.sonatype.org/content/groups/scala-tools/",

    // Snapshots: the bleeding edge
    "snapshots-repo" at "http://www.scala-tools.org/repo-snapshots"
  )

}
