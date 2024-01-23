plugins {
    java
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "org.ctag.monolith.back"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

