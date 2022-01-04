package com.example.graphql.resolver.bank.mutation

import com.example.graphql.dto.Client
import com.example.graphql.dto.CreateClientInput
import com.example.graphql.service.ClientService
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class ClientMutation(val clientService: ClientService) : GraphQLMutationResolver {

	fun createClient(input: CreateClientInput) = clientService.addClient(
		Client(input.id, input.firstName, input.middleName, input.lastName)
	)
}
