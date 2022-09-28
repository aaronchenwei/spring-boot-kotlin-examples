package io.github.aaronchenwei.springboot.example

import io.github.aaronchenwei.springboot.example.domain.entity.Account
import io.github.aaronchenwei.springboot.example.domain.repository.AccountRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.repository.findByIdOrNull

@SpringBootApplication
class RestWebH2Application {

  private val log = LoggerFactory.getLogger(RestWebH2Application::class.java)

  @Bean
  fun init(repository: AccountRepository) = CommandLineRunner {
    // save a couple of customers
    repository.save(Account(1L, "Bauer", 100.0))
    repository.save(Account(2L, "Chloe", 200.0))
    repository.save(Account(3L, "Kim", 300.0))
    repository.save(Account(4L, "David", 400.0))
    repository.save(Account(5L, "Michelle", 500.0))

    // fetch all accounts
    log.info("Accounts found with findAll():")
    log.info("-------------------------------")
    repository
      .findAll()
      .forEach { log.info(it.toString()) }
    log.info("")

    // fetch an individual account by ID
    val customer = repository.findByIdOrNull(1L)
    customer?.let {
      log.info("Account found with findById(1L):")
      log.info("--------------------------------")
      log.info(it.toString())
      log.info("")
    }

  }

}

fun main(args: Array<String>) {
  runApplication<RestWebH2Application>(*args)
}
