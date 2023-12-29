object Dependencies {
    // Spring
    const val SPRING_BOOT = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_BOOT_TEST = "org.springframework.boot:spring-boot-starter-test"
    const val SPRING_BOOT_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val SPRING_BOOT_THYMELEAF = "org.springframework.boot:spring-boot-starter-thymeleaf"

    // Apache
    const val COMMONS_COLLECTIONS = "org.apache.commons:commons-collections4:${Versions.COMMONS_COLLECTIONS_V}"
    const val COMMONS_LANG = "org.apache.commons:commons-lang3:${Versions.COMMONS_LANG_V}"

    // Lombok
    const val LOMBOK = "org.projectlombok:lombok"
    const val LOMBOK_MAP = "org.projectlombok:lombok-mapstruct-binding:${Versions.LOMBOK_MAP_STRUCT_V}"

    // Liquibase
    const val LIQUIBASE = "org.liquibase:liquibase-core"

    // Postgresql
    const val POSTGRESQL = "org.postgresql:postgresql"

    // MapStruct
    const val MAP_STRUCT = "org.mapstruct:mapstruct:${Versions.MAP_STRUCT_V}"
    const val MAP_STRUCT_PROC = "org.mapstruct:mapstruct-processor:${Versions.MAP_STRUCT_V}"

    // Telegram
    const val TELEGRAM = "org.telegram:telegrambots:${Versions.TELEGRAM_V}"
}