# What is a modular JAR file ?

This is a copy from [this link](https://stackoverflow.com/questions/46513903/what-is-the-difference-between-modules-and-jar-files).

Module: A new language feature introduced in Java 9 (similar to class, interface, package, etc.) that consists of a collection of packages, similar to how a package consists of a collection of types.

JAR: An archive file format that bundles code and resources and which can be loaded by the JVM.

More specifically, a module is defined as follows:

> In order to provide reliable configuration and strong encapsulation in a way that is both approachable to developers and supportable by existing tool chains we treat modules as a fundamental new kind of Java program component. A module is a named, self-describing collection of code and data. Its code is organized as a set of packages containing types, i.e., Java classes and interfaces; its data includes resources and other kinds of static information.
>
>  ...
>
> A module’s self-description is expressed in its module declaration, a new construct of the Java programming language.
>
> ...
>
> A module declaration is compiled, by convention, into a file named module-info.class, placed similarly in the class-file output directory.

A module can be compiled into a Jar file, in which case the Jar file is labelled a modular Jar file:

> Existing tools can already create, manipulate, and consume JAR files, so for ease of adoption and migration we define modular JAR files. A modular JAR file is like an ordinary JAR file in all possible ways, except that it also includes a module-info.class file in its root directory.

Some other differences between a module and a JAR:

* Modules can require other modules in order to allow accessing dependent classes by the requiring module. A Jar has no such dependency concept.
* A module can decide which classes and interfaces to export to other modules that require it. A Jar has no such encapsulation mechanism.
* A module can be compiled into a modular Jar file, but some modules (e.g. JDK modules) are compiled into another format called JMOD.
* The name of a JAR can be changed. As long as the JVM classloader finds the needed class on the classpath (which can be composed of a single JAR, multiple JARs, or a mix between directories or JARs), the name of the JAR file can be anything. However, the name of a module can be explicitly referenced in the declaration of other modules, and such the name defines it and cannot be changed freely.
