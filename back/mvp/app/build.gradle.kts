plugins {
    id("ctnb-mvp-app")
}

dependencies {
    implementation(project(":app:endpoint:web"))
    implementation(project(":app:endpoint:telegram"))
}
