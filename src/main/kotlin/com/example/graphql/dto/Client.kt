package com.example.graphql.dto

import java.util.*

data class Client(
	val id: Int,
	val firstName: String,
	val middleNames: List<String>? = null,
	val lastName: String,
	var client: Client? = null
	)
