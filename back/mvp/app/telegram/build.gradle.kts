plugins {
    id("ctnb-mvp-endpoint")
}

dependencies {
    implementation(project(":app:domain"))

    implementation(Dependencies.TELEGRAM)
}
