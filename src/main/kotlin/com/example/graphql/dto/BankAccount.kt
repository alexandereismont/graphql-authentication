package com.example.graphql.dto

import java.util.*

data class BankAccount(val id: UUID, val clientId: Int, val currency: Currency)

enum class Currency {
	NOK,
	USD
}
