package io.github.aaronchenwei.springboot.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxR2dbcH2Application

fun main(args: Array<String>) {
  runApplication<WebfluxR2dbcH2Application>(*args)
}
