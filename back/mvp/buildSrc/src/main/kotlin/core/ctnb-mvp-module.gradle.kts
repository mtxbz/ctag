plugins {
    id("ctnb-mvp")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}

tasks.withType<Test> {
    testLogging.events("PASSED", "SKIPPED", "FAILED")

    useJUnitPlatform()
}