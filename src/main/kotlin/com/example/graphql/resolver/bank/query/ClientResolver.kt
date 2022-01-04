package com.example.graphql.resolver.bank.query

import com.example.graphql.dto.Client
import com.example.graphql.service.ClientService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class ClientResolver(val clientService: ClientService) : GraphQLQueryResolver {

	/*fun client(bankAccount: BankAccount) : DataFetcherResult<Client> {
			return DataFetcherResult.newResult<Client>()
					.data( Client(bankAccount.id, "First", Collections.emptyList(), "Last"))
					.error(GenericGraphQLError("Error getting client"))
					.build()
	}*/

	//
	//	val executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())

	/*	fun client(bankAccount: BankAccount) : CompletableFuture<Client> {
			return CompletableFuture.supplyAsync(
					{ Client(UUID.randomUUID(), "First", Collections.emptyList(), "Last") },
					executorService
			)
		}*/

	fun client(clientId: Int): Client? = clientService.findClient(clientId)
}
