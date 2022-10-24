pluginManagement {
  repositories {
    maven { url = uri("https://repo.spring.io/milestone") }
    gradlePluginPortal()
  }
}

rootProject.name = "spring-boot-kotlin-examples"
include("hello-world-web")
include("rest-web-h2")
include("webflux-r2dbc-h2")
