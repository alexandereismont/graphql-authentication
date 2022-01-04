package com.example.graphql.resolver.bank.mutation

import com.example.graphql.dto.BankAccount
import com.example.graphql.dto.CreateBankAccountInput
import com.example.graphql.dto.Currency
import com.example.graphql.service.BankService
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class BankAccountMutation(val bankService: BankService) : GraphQLMutationResolver {

	fun createBankAccount(input: CreateBankAccountInput) : Boolean {
		return bankService.addBankAccount(
			BankAccount(UUID.randomUUID(), clientId = input.clientId ,currency = Currency.NOK)
		)
	}
}
