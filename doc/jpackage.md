# Notes abouts jpackage

The command below will generate an installation wizard for the application: 

    jpackage --name myapp --input build\libs --main-jar application-1.0-SNAPSHOT.jar --main-class org.beurive.Main --type msi --win-dir-chooser --win-console --win-per-user-install
    
* `--name`: the name of the application.
* `--input`: path to the directory that contains the JAR files.
* `--main-jar`: mane of the JAR file that contains the main entry point for the application (the class `Main`).
* `--main-class`: fully qualified name of the class `Main`.
* `--type`: the type of installer. Under Windows you must specify the value "MSI".
* `--win-dir-chooser`: specify that the installation wizard must ask the user the path to the installation directory.
* `--win-console`: ask the installation wizard to create a console launcher.
* `--win-per-user-install`: install fir user instead of system wide. 

Documents:

* [A Guide to jpackage in Java 14](https://www.baeldung.com/java14-jpackage)
* [Use jpackage to Create Native Java App Installers](https://www.devdungeon.com/content/use-jpackage-create-native-java-app-installers)
