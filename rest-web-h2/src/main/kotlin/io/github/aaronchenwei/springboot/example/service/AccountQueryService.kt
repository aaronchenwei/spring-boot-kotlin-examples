package io.github.aaronchenwei.springboot.example.service

import io.github.aaronchenwei.springboot.example.domain.entity.Account
import io.github.aaronchenwei.springboot.example.domain.repository.AccountRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AccountQueryService(private val repo: AccountRepository) {
  fun getAccountById(accountId: Long) = repo.findByIdOrNull(accountId)
  fun getAccounts(): List<Account> = repo.findAll()
}
