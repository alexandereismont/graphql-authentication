package com.example.graphql.configuration

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.springframework.http.codec.multipart.Part

class PartDeserializer : JsonDeserializer<Part>() {

	override fun deserialize(p0: JsonParser?, p1: DeserializationContext?): Part? {
		return null
	}
}
