import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "studio.aroundhub"
version = "0.0.1"  // 강의자 그냥 별로라고 바꿈

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17" // 처음에 1.8로 설정되어 있음. 인텔리제이가 안바까주는듯?
}

application {
    mainClass.set("MainKt")
}