Scala-starter
=============

An easy way to get started with Scala.

## Overview



## Getting started

### Mac

Get [Java 1.6 or later](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

Install Homebrew:

```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Install SBT:

```
brew install git sbt
```

Get these source files:

```
git clone https://github.com/csoma/Scala-starter.git
cd Scala-starter
```

Alternative: [download as a ZIP](https://github.com/csoma/Scala-starter/archive/master.zip)

Start the command line [REPL](http://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop)

```
./sbt console
println("Hello!")

Ctrl-D will exit
```

Or run the included "Hello World" app

```
sbt run
```

See also the "Scala IDE" below

### Windows

- [Download and install sbt](http://www.scala-sbt.org/release/tutorial/Setup.html). Choose  MSI or ZIP.
- To use Git:
    - [Download and install git](http://git-scm.com/downloads)
    - Get the sources: `git clone https://github.com/csoma/Scala-starter.git`
- Or [download as a ZIP](https://github.com/csoma/Scala-starter/archive/master.zip)
- Start REPL: `sbt console`
- Build and run the app: `sbt run`

### Linux

- Ubuntu: `apt-get install sbt git`
- RedHat: `yum install sbt git`
- Get the sources: `git clone https://github.com/csoma/Scala-starter.git`
- Start REPL: `sbt console`
- Build and run the app: `sbt run`


## The files

* **src/main/scala/test/Main.scala** - a minimal "Hello World" program
* **project/Buid.scala** - sets the project name, compiler flags, additional components like Scalatra and Postgres driver. Customize it to your needs.
* **project/build.sbt** - adds the "eclipse" command to sbt (sbt plugin)

## Enabling additional components

Open the "project/Build.scala" file in the editor, find the "Additional components" section.

To enable a library just remove the comment from that line, like Scalaz, Postgres driver, Apache HttpComponent etc.

SBT will automatically download the specified library version and add it to classpath.

Any component supported by Maven can be added, see the "Component versions" section. The default repo list can be extended with the "ExtraResolvers" variable at the end of the file.

## Scala IDE

### IntelliJ IDEA

See the following links:

* [IntelliJ in a few steps](https://news.ycombinator.com/item?id=6239003)
* [IntelliJ download link](http://www.jetbrains.com/idea/features/scala.html)
* [IntelliJ Scala plugin blog](http://blog.jetbrains.com/scala/)

### Eclipse

* Install Eclipse
* Install Eclipse Scala IDE plugin: http://scala-ide.org/
* In project/build.sbt enable the Eclipse plugin
* From command line run "sbt eclipse"
* Make sure the Scala perspective is selected
* From Eclipse use "Import Wizard" to import "General/Existing Projects into Workspace"
* Run now should have "Scala Application"

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

* [Typesafe Activator](http://www.typesafe.com/get-started)
* Scalatra starter (REST API): https://github.com/scalatra/scalatra-sbt-prototype
* Lift starter (Web framework): https://github.com/lift/lift_25_sbt
* giter8 template (sbt project scaffolding): https://github.com/ymasory/sbt.g8
* [CodeBrew: Scala in the browser](https://codebrew.io/)

## Other Scala resources

* [Scala School](http://twitter.github.io/scala_school/) and related [discussion](https://news.ycombinator.com/item?id=6236967)
* About the SBT bash script used in this project: https://github.com/paulp/sbt-extras
* Discussion about "why Scala?": http://news.ycombinator.com/item?id=4980982 <br>Includes links to free Scala books, articles, videos etc.
* [Scala for the Impatient](http://www.amazon.com/Scala-Impatient-Cay-S-Horstmann/dp/0321774094) book and [PDF download](http://typesafe.com/resources/book/scala-for-the-impatient)
* [An Introduction to Scala for Java Developers](http://www.infoq.com/articles/scala-for-java-devs) article
* [Akka](http://akka.io/) Scalable real-time transaction processing
* [Reactive Scala](http://reactivex.io/rxscala/)
* [Dropwizard-scala](https://github.com/bretthoerner/dropwizard-scala) for building production-ready RESTful web services
* Even more: [LiftWeb's Resources Wiki](https://www.assembla.com/spaces/liftweb/wiki/Resources)
