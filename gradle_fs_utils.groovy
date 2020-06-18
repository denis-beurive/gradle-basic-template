/**
 * gradle_utils.groovy
 *
 * This file contains file system utilities.
 */

import groovy.io.FileType

/**
 * Return the character used separate JAR files within the CLASSPATH environment variable.
 * - Under Windows: ";"
 * - Under Unix: ":"
 * @return The character used separate JAR files within the CLASSPATH environment variable.
 */

def get_classpath_separator() {
    Properties properties = System.getProperties();
    return properties.getProperty("path.separator");
}

/**
 * Return the list of JAR files within a directory identified by its given path.
 * @param in_dir Path to the directory that contains the JAR files.
 * @return The list of JAR files within the given directory.
 */

def get_class_path(String in_dir) {
    def list = []
    def dir = new File("${in_dir}")
    dir.eachFileRecurse (FileType.FILES) { entry ->
        if (entry.toString() ==~ /^.*\.jar$/) {
            list << entry
        }
    }
    return list
}
