plugins {
    id("ctag-monolith-endpoint")
}

dependencies {
    implementation(project(":app:domain:car"))

    implementation(Dependencies.SPRING_BOOT_THYMELEAF)
}
