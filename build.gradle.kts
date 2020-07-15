plugins {
    java
//    id("uk.co.mulecode.artifact-versioning") version "1.0.1.R3"
    id("uk.co.mulecode.artifact-versioning") version "1.0.1.BUILD-SNAPSHOT"
}

versionConfig {
    versionIncrementer = "PATCH"
    tagSuffix = "SNAPSHOT"
}

group = "com.mulecode"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.12")
    compileOnly("org.projectlombok:lombok:1.18.12")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.12")
    testCompileOnly("org.projectlombok:lombok:1.18.12")

    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}
