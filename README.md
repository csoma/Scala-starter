Scala-starter
=============

An easy way to get started with Scala:

* On Mac there are no dependencies, the included batch file will download all the required files
* On Windows you will need to [download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#manual-installation) manually (using MSI or ZIP)
* On Linux [sbt packages are available](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt) for RedHat, Ubuntu, Gentoo etc

## Getting Started

### Using git

    git clone https://github.com/csoma/Scala-starter.git  
    cd Scala-starter

### Alternative: download and unzip

    https://github.com/csoma/Scala-starter/archive/master.zip

## Running

### Mac

Start the REPL

    ./sbt console-quick
    (exit with Ctrl-D)

Run the "Hello World" app

    ./sbt run

### Windows

* [Download and install sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup)
* Starting REPL: sbt.bat console-quick
* Running the app: sbt.bat run

## The files

* **sbt** - convenience bash script to avoid any manual install. It will check for dependencies (Java, Scala, libraries) and automatically download required files. Not needed if SBT is already installed via homebrew, apt-get, MSI etc.
* **src/main/scala/test/Main.scala** - a minimal "Hello World" program
* **project/Buid.scala** - sets some compiler flags and the project name

## Additional components

Remove the comment from "libraryDependencies" line in "Build.scala" file to enable additional components like Scalaz, Postgres driver, Apache HttpComponent etc

    ,libraryDependencies ++= scalazComponents ++ apacheHttpComponents ++ posgresDBComponents

SBT will download the specified library version and add it to classpath.




## Command line

* **sbt help** - SBT usage help
* **sbt help tasks** - available task list: clean, compile, run, package, test etc.
* **sbt console-quick** - starts the Scala REPL
* **sbt console** - starts the Scala REPL with the current project in the classpath
* **sbt run** - runs the active project (in this case just prints "Hello World")
* **sbt package** - creates a JAR file in the "target" folder (size: about 1.5K)
* **sbt** - starts the SBT console


## More

* About the SBT bash script: https://github.com/paulp/sbt-extras
* Scalatra starter (REST API): https://github.com/scalatra/scalatra-sbt-prototype
* Discussion about "why Scala?": http://news.ycombinator.com/item?id=4980982 <br>Includes links to free Scala books, articles, videos etc.
* [Scala for the Impatient](http://www.amazon.com/Scala-Impatient-Cay-S-Horstmann/dp/0321774094) book and [PDF download](http://typesafe.com/resources/book/scala-for-the-impatient)
* [An Introduction to Scala for Java Developers](http://www.infoq.com/articles/scala-for-java-devs) article
* Even more: [LiftWeb's Resources Wiki](https://www.assembla.com/spaces/liftweb/wiki/Resources)
