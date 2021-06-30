# gradle_javafx_jar_guide

Important things to know to build a javafx jar with gradle




look in the build.gradle file

jar {
    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
    manifest {
        attributes 'Main-Class': 'javafx.Main'
    }
}

//this is really important
sourceSets {
    main {
        resources {
            srcDirs = ["src/main/java"]
        }
    }
}
