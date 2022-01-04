package com.example.graphql.resolver.bank.query

import com.example.graphql.dto.BankAccount
import com.example.graphql.dto.Client
import com.example.graphql.dto.Currency
import com.example.graphql.service.BankService
import graphql.kickstart.tools.GraphQLResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class BankAccountResolver(val bankService: BankService) : GraphQLResolver<Client> {

	fun bankAccount(client: Client) = bankService.findBankAccount(client.id)

}
