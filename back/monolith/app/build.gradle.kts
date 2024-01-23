plugins {
    id("ctag-monolith-app")
}

dependencies {
    implementation(project(":app:endpoint:web"))
    implementation(project(":app:endpoint:telegram"))
}
