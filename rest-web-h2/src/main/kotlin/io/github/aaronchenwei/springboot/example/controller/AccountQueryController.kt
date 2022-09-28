package io.github.aaronchenwei.springboot.example.controller

import io.github.aaronchenwei.springboot.example.domain.entity.Account
import io.github.aaronchenwei.springboot.example.service.AccountQueryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = ["/account"])
class AccountQueryController(private val accountQueryService: AccountQueryService) {

  @GetMapping("/{accountId}")
  fun getAccountById(@PathVariable(value = "accountId") accountId: Long): ResponseEntity<Account?>? {
    val accountOpt: Account? = accountQueryService.getAccountById(accountId)
    return accountOpt?.let { ResponseEntity.ok(it) } ?: ResponseEntity.notFound().build()
  }

  @GetMapping("/list")
  fun getAccounts(): List<Account?>? {
    return accountQueryService.getAccounts()
  }
}
