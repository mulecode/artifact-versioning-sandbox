plugins {
    java
//    id("uk.co.mulecode.artifact-versioning") version "1.0.0.BUILD-SNAPSHOT"
    id("uk.co.mulecode.artifact-versioning") version "1.0.0.RELEASE"
}

versionConfig {
    versionIncrementer = "PATCH"
    tagSuffix = "M"
    initialVersion = "1.0.0"
}

group = "com.mulecode"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}
