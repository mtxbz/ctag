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
    implementation(Dependencies.SPRING_BOOT)
}