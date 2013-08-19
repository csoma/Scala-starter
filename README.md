Scala-starter
=============

An easy way to get started with Scala:

* On Mac there are no dependencies, the included batch file (sbt) will download all the required files
* On Windows you will need to [download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#manual-installation) manually (using MSI or ZIP)
* On Linux [sbt packages are available](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt) for RedHat, Ubuntu, Gentoo etc

## Download

### Using git

    git clone https://github.com/csoma/Scala-starter.git  
    cd Scala-starter

### Alternative: download and unzip

    https://github.com/csoma/Scala-starter/archive/master.zip

## Run

### Mac

Start the REPL

    ./sbt console-quick
    println("Hello!")
    (exit with Ctrl-D)

Run the included "Hello World" app

    ./sbt run

**Alternative:** `brew install sbt`

See also the "Scala IDE" below

### Linux

`apt-get install sbt`

or 

`yum install sbt`

### Windows

* [Download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup)
* **Starting REPL**: sbt.bat console-quick
* **Running the app**: sbt.bat run
* See also "Scala IDE" below

## The files

* **sbt** - convenience bash script to avoid any manual install. It will check for dependencies (Java, Scala, libraries) and automatically download required files. Not needed if SBT is already installed via homebrew, apt-get, MSI etc.
* **src/main/scala/test/Main.scala** - a minimal "Hello World" program
* **project/Buid.scala** - sets the project name, compiler flags, additional components like Scalaz and Postgres driver
* **project/build.sbt** - adds the "eclipse" command (sbt plugin)

## Additional components

Remove the comment from "libraryDependencies" line in "Build.scala" file to enable additional components like Scalaz, Postgres driver, Apache HttpComponent etc

    ,libraryDependencies ++= scalazComponents ++ apacheHttpComponents ++ posgresDBComponents

SBT will download the specified library version and add it to classpath.

## Scala IDE

### Eclipse

* Install Eclipse
* Install Eclipse Scala IDE plugin: http://scala-ide.org/
* From command line run "sbt eclipse"
* Make sure the Scala perspective is selected
* From Eclipse use "Import Wizard" to import "General/Existing Projects into Workspace"
* Run now should have "Scala Application"


### IntelliJ IDEA

See the following links:

* http://www.jetbrains.com/idea/features/scala.html
* http://blog.jetbrains.com/scala/

## Command line

### SBT - build tool

* **sbt help** - SBT (build tool) usage help
* **sbt help tasks** - available task list: clean, compile, run, package, test etc.
* **sbt console-quick** - starts the Scala REPL
* **sbt console** - starts the Scala REPL with the active project in the classpath
* **sbt run** - runs the active project (in this case just prints "Hello World")
* **sbt eclipse** - generate Eclipse project definitions
* **sbt package** - creates a JAR file in the "target" folder (size: about 1.5K)
* **sbt** - starts the SBT console

### SBT script

When the included sbt script is used:

* **sbt -h** - SBT (convenience script) help
* **sbt -210 command** - Use Scala 2.10
* **sbt -29 command** - Use Scala 2.9
* **sbt -jvm-debug 8090 command** - Turn on JVM debugging on port 8090

## More starter projects

* Scalatra starter (REST API): https://github.com/scalatra/scalatra-sbt-prototype
* Lift starter (Web framework): https://github.com/lift/lift_25_sbt
* giter8 template (sbt project scaffolding): https://github.com/ymasory/sbt.g8

## Other Scala resources

* [Scala School](http://twitter.github.io/scala_school/) and related [discussion](https://news.ycombinator.com/item?id=6236967)
* About the SBT bash script used in this project: https://github.com/paulp/sbt-extras
* Discussion about "why Scala?": http://news.ycombinator.com/item?id=4980982 <br>Includes links to free Scala books, articles, videos etc.
* [Scala for the Impatient](http://www.amazon.com/Scala-Impatient-Cay-S-Horstmann/dp/0321774094) book and [PDF download](http://typesafe.com/resources/book/scala-for-the-impatient)
* [An Introduction to Scala for Java Developers](http://www.infoq.com/articles/scala-for-java-devs) article
* Even more: [LiftWeb's Resources Wiki](https://www.assembla.com/spaces/liftweb/wiki/Resources)
