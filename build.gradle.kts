plugins {
    idea
}

buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    dependencies {
        classpath(Dependencies.Plugins.android)
        classpath(Dependencies.Plugins.kotlin)
    }
}

idea {
    module {
        excludeDirs = excludeDirs + file("node_modules")
    }
}