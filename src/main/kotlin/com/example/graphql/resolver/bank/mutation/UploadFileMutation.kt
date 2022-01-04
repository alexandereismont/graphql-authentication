package com.example.graphql.resolver.bank.mutation

import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component
import javax.servlet.http.Part

@Component
class UploadFileMutation : GraphQLMutationResolver {

	fun uploadFile (file: Part, environment: DataFetchingEnvironment) : Boolean {

		return true
	}

}
