package com.example.graphql.dto

data class CreateClientInput(
	val id: Int,
	val firstName: String,
	val middleName: List<String>? = null,
	val lastName: String
)
