package io.github.aaronchenwei.springboot.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

  @GetMapping("/")
  fun index(): String {
    return "Hello, World"
  }

}
