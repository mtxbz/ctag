plugins {
    id("ctnb-mvp-endpoint")
}

dependencies {
    implementation(project(":app:domain:car"))

    implementation(Dependencies.TELEGRAM)
    implementation(Dependencies.JAXB) //for telegram
}
