package io.github.aaronchenwei.springboot.example.domain.repository

import io.github.aaronchenwei.springboot.example.domain.entity.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
}
