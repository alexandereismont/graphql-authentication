package com.example.graphql.dto

data class CreateBankAccountInput(
	val clientId: Int,
	val currency: Currency? = null
)
