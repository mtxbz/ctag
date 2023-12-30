plugins {
    id("ctnb-mvp-endpoint")
}

dependencies {
    implementation(project(":app:domain:car"))

    implementation(Dependencies.SPRING_BOOT_THYMELEAF)
}
