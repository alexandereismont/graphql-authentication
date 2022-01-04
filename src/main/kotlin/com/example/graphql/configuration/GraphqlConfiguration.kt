package com.example.graphql.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.addDeserializer
import graphql.kickstart.servlet.apollo.ApolloScalars
import graphql.schema.GraphQLScalarType
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.codec.multipart.Part

@Configuration
class GraphqlConfiguration {

	@Bean
	fun uploadScalarDefine(): GraphQLScalarType {
		return ApolloScalars.Upload
	}

	@Bean
	fun objectMapper(): ObjectMapper? {
		val objectMapper = ObjectMapper()
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
		val module = SimpleModule()
		module.addDeserializer(Part::class, PartDeserializer())
		objectMapper.registerModule(module)
		return objectMapper
	}

}
