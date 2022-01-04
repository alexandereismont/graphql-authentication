package com.example.graphql.exceptions

import graphql.GraphQLException
import graphql.kickstart.spring.error.ThrowableGraphQLError
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.ExceptionHandler

@Component
class GraphqlExceptionHandler {

		@ExceptionHandler(GraphQLException::class)
		fun handle(e: GraphQLException) : ThrowableGraphQLError {
			return ThrowableGraphQLError(e)
		}

		@ExceptionHandler(RuntimeException::class)
		fun handleRuntime(e: RuntimeException) : ThrowableGraphQLError {
				return ThrowableGraphQLError(e,"Internal error")
		}
}
