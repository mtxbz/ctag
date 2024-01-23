plugins {
    id("ctag-monolith-endpoint")
}

dependencies {
    implementation(project(":app:domain:car"))

    implementation(Dependencies.TELEGRAM)
    implementation(Dependencies.JAXB) //for telegram
}
