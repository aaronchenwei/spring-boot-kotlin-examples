package io.github.aaronchenwei.springboot.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldWebApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldWebApplication>(*args)
}