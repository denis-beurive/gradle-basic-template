# Description

This repository contains a basic template for a Gradle project.

We use `jpackage` to produce a [Self-Contained Application Packaging](https://docs.oracle.com/javase/9/deploy/self-contained-application-packaging.htm#JSDPG583).

# Requirements

* JDK [14](doc/version-jdk.md).
* Gradle [6.3](doc/version-gradle.md).
* JPackage [14](doc/version-jpackage.md). This tool is included within JDK 14.
* Windows:
  * Wix Tools [3.11.2](https://wixtoolset.org/releases/)

# Notes

* [Windows](doc/notes-windows.md)
* [Java](doc/java-notes.md)
* [jpackage](doc/jpackage.md)

# Links

* [Creating a Windows executable for a Java application](https://www.csie.ntu.edu.tw/~b90008/jniexe.html)
* [Self-Contained Application Packaging](https://docs.oracle.com/javase/9/deploy/self-contained-application-packaging.htm#JSDPG583)
* [JEP 343: Packaging Tool (Incubator)](https://openjdk.java.net/jeps/343)
* [Building Self-Contained, Installable Java Applications with JEP 343: Packaging Tool](https://www.infoq.com/news/2019/03/jep-343-jpackage/)
* [What is the difference between modules and JAR files?](https://stackoverflow.com/questions/46513903/what-is-the-difference-between-modules-and-jar-files). Local copy [here](doc/java-modular-jar.md)
* [A Guide to jpackage in Java 14](https://www.baeldung.com/java14-jpackage)
* [Use jpackage to Create Native Java App Installers](https://www.devdungeon.com/content/use-jpackage-create-native-java-app-installers)
