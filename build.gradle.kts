val javaVersion = JavaVersion.VERSION_15
val assertJVersion = "3.18.1"

plugins {
    kotlin("jvm") version "1.4.30"
    application
}

group = "land.tbp.codeforces.problems"
version = "1.0.0"
description = "Codeforces Problems and Solutions"
java.sourceCompatibility = javaVersion
java.targetCompatibility = javaVersion

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("kotlin-stdlib"))

    testImplementation("org.assertj:assertj-core:$assertJVersion")
    testImplementation(platform("org.junit:junit-bom:5.7.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    configurations.all {
        exclude(group = "junit", module = "junit")
        exclude(module = "mockito-core")
    }
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = javaVersion.majorVersion
            languageVersion = "1.4"
            apiVersion = "1.4"
        }
    }

    withType<Test> {
        useJUnitPlatform()
    }
}
