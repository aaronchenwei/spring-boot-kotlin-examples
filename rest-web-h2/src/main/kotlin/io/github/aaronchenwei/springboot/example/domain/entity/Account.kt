package io.github.aaronchenwei.springboot.example.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "account")
data class Account(
  @Id
  val id: Long? = null,
  val name: String,
  val balance: Double
)
