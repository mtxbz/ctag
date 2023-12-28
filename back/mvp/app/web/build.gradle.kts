plugins {
    id("ctnb-mvp-endpoint")
}

dependencies {
    implementation(Dependencies.SPRING_BOOT_THYMELEAF)

    implementation(project(":app:domain"))
}
