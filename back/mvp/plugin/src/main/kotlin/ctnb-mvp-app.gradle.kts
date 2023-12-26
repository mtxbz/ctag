plugins {
    id("ctnb-mvp")
}

tasks.bootJar {
    enabled = true
}

tasks.jar {
    enabled = false
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}