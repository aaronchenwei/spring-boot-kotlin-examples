package io.github.aaronchenwei.springboot.example.domain.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "account")
data class Account(
  @Id
  val id: Long? = null,
  val name: String,
  val balance: Double
)
