## Check whether a JAR includes a `MANIFEST.MF` or not

    jar tvf application-1.0-SNAPSHOT.jar
        0 Thu Jun 18 17:17:38 CEST 2020 META-INF/
       55 Thu Jun 18 17:14:46 CEST 2020 META-INF/MANIFEST.MF
        0 Thu Jun 18 17:09:30 CEST 2020 org/
        0 Thu Jun 18 17:09:30 CEST 2020 org/beurive/
      530 Thu Jun 18 17:09:30 CEST 2020 org/beurive/Main.class

## View the content of the file MANIFEST.MF

A JAR file is a ZIP file. Any ZIP utility can be used to extract a `MANIFEST.MF` file from a JAR.

Example of `MANIFEST.MF` file: 

    Manifest-Version: 1.0
    Main-Class: org.beurive.Main
