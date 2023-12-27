plugins {
    id("ctnb-mvp-module")
}

dependencies {
    implementation(Dependencies.SPRING_BOOT)
    implementation(Dependencies.COMMONS_COLLECTIONS)
    implementation(Dependencies.COMMONS_LANG)

    compileOnly(Dependencies.LOMBOK)
    annotationProcessor(Dependencies.LOMBOK)

    implementation(Dependencies.MAP_STRUCT)
    annotationProcessor(Dependencies.MAP_STRUCT_PROC)
    implementation(Dependencies.LOMBOK_MAP)

    testImplementation(Dependencies.SPRING_BOOT_TEST)
}
