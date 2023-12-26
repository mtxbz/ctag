plugins {
    id("ctnb-mvp-app")
}

dependencies {
    implementation(project(":app:web"))
    implementation(project(":app:telegram"))
}
