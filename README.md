Scala-starter
=============

An easy way to get started with Scala

* On Mac there are no dependencies, the include batch file will download everything
* On Windows you will need to download sbt manually (MSI or ZIP)
* On Linux sbt packages are available for RedHat, Ubuntu, Gentoo etc

## Geting Started

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

Run the Hello World app

    ./sbt run

### Windows

Download and install sbt: http://www.scala-sbt.org/release/docs/Getting-Started/Setup

* REPL: sbt.bat console-quick
* Running the app: sbt.bat run

## Additional components

Remove the comment from "libraryDependencies" line in "Build.scala" file to enable additional components like Scalaz, Postgres driver, Apache HttpComponent etc

SBT will download the specified version and add it to classpath.


## The files

* **sbt** - a convenience script to avoid any manual install. Will check for dependencies (Java, Scala, libraries) and automatically download files. Not needed if SBT is already installed via hmoebrew, apt-get, MSI etc.
* **src/main/scala/test/Main.scala** - a println for Hello World message
* **project/Buid.scala** - sets some compiler flags and the project name


## Command line

* **sbt help** - SBT usage help
* **sbt help tasks** - available task list: clean, compile, run, package, test etc.
* **sbt console-quick** - starts the Scala REPL
* **sbt console** - starts the Scala REPL with the current project in the classpath
* **sbt run** - runs the active project (in this case prints "Hello World")
* **sbt package** - creates a JAR file in the "target" folder (size: about 1.5K)
* **sbt** - starts the SBT console


## More

* About the SBT script: https://github.com/paulp/sbt-extras
* Scalatra starter (REST API): https://github.com/scalatra/scalatra-sbt-prototype
* Lift examples: https://github.com/lift/examples
* Discussion about "why Scala?": http://news.ycombinator.com/item?id=4980982 Includes links to free Scala books, articles, videos etc.

