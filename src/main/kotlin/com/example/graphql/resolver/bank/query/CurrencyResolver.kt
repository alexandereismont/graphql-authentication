package com.example.graphql.resolver.bank.query

import com.example.graphql.dto.Currency
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class CurrencyResolver : GraphQLQueryResolver {

	fun getCurrencies() = Currency.values()
}
