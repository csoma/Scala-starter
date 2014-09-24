Scala-starter
=============

An easy way to get started with Scala.

It will automatically download all the required files and allow you to start writing code or to do quick tests in the REPL (see `sbt console` below).

As an alternative you can also try [Scala in the browser](https://codebrew.io/).

## Downloading this source

Dependencies:

* On Mac there are no dependencies, the included batch file `sbt` will download all the required files.
* On Windows you will need to [download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#manual-installation) manually (using MSI or ZIP).
* On Linux [sbt packages are available](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt) for RedHat, Ubuntu, Gentoo etc.

### Download using git

    git clone https://github.com/csoma/Scala-starter.git  
    cd Scala-starter

### Alternative: download as a ZIP

    https://github.com/csoma/Scala-starter/archive/master.zip

## Mac OS X

Start the command line [REPL](http://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop)

    ./sbt console-quick
    println("Hello!")
    Ctrl-D will exit

Run the included "Hello World" app

    ./sbt run

**Alternative:** `brew install sbt`

See also the "Scala IDE" below

## Linux

1. Install SBT: `apt-get install sbt` or `yum install sbt`
2. Download the source (git or ZIP)
3. Start REPL: `sbt console-quick`
4. Build and run the app: `sbt run`

## Windows

1. [Download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup)
2. Download the source (git or ZIP)
3. **Starting REPL**: `sbt.bat console-quick`
4. **Running the app**: `sbt.bat run`
5. See also "Scala IDE" below

## The files

* **sbt** - convenience bash script to avoid any manual install. It will check for dependencies (Java, Scala, libraries) and automatically download required files. Not needed if SBT is already installed via homebrew, apt-get, MSI etc.
* **src/main/scala/test/Main.scala** - a minimal "Hello World" program
* **project/Buid.scala** - sets the project name, compiler flags, additional components like Scalatra and Postgres driver. Customize it to your needs.
* **project/build.sbt** - adds the "eclipse" command to sbt (sbt plugin)

## Enabling additional components

Open the "Build.scala" file in the editor, find the "Additional components" section.

To enable a library just remove the comment from that line, like Scalaz, Postgres driver, Apache HttpComponent etc.

SBT will automatically download the specified library version and add it to classpath.

Any component supported by Maven can be added, see the "Component versions" section. The default repo list can be extended with the "ExtraResolvers" variable at the end of the file.

## Scala IDE

### Eclipse

* Install Eclipse
* Install Eclipse Scala IDE plugin: http://scala-ide.org/
* In project/build.sbt enable the Eclipse plugin
* From command line run "sbt eclipse"
* Make sure the Scala perspective is selected
* From Eclipse use "Import Wizard" to import "General/Existing Projects into Workspace"
* Run now should have "Scala Application"

### IntelliJ IDEA

See the following links:

* [IntelliJ in a few steps](https://news.ycombinator.com/item?id=6239003)
* [IntelliJ download link](http://www.jetbrains.com/idea/features/scala.html)
* [IntelliJ Scala plugin blog](http://blog.jetbrains.com/scala/)

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

* [CodeBrew: Scala in the browser](https://codebrew.io/)
* [Scala School](http://twitter.github.io/scala_school/) and related [discussion](https://news.ycombinator.com/item?id=6236967)
* About the SBT bash script used in this project: https://github.com/paulp/sbt-extras
* Discussion about "why Scala?": http://news.ycombinator.com/item?id=4980982 <br>Includes links to free Scala books, articles, videos etc.
* [Scala for the Impatient](http://www.amazon.com/Scala-Impatient-Cay-S-Horstmann/dp/0321774094) book and [PDF download](http://typesafe.com/resources/book/scala-for-the-impatient)
* [An Introduction to Scala for Java Developers](http://www.infoq.com/articles/scala-for-java-devs) article
* Even more: [LiftWeb's Resources Wiki](https://www.assembla.com/spaces/liftweb/wiki/Resources)
