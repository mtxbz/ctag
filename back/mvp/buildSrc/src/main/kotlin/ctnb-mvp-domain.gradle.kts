plugins {
    id("ctnb-mvp-module")
}

dependencies {
    implementation(Dependencies.SPRING_BOOT)
    implementation(Dependencies.COMMONS_COLLECTIONS)
    implementation(Dependencies.COMMONS_LANG)

    implementation(Dependencies.SPRING_BOOT_JPA)
//    implementation(Dependencies.LIQUIBASE)
    runtimeOnly(Dependencies.POSTGRESQL)

    compileOnly(Dependencies.LOMBOK)
    annotationProcessor(Dependencies.LOMBOK)

    implementation(Dependencies.MAP_STRUCT)
    annotationProcessor(Dependencies.MAP_STRUCT_PROC)
    implementation(Dependencies.LOMBOK_MAP)

    testImplementation(Dependencies.SPRING_BOOT_TEST)
}
