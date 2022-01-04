package com.example.graphql.service

import com.example.graphql.dto.BankAccount
import org.springframework.stereotype.Component

@Component
class BankService {

	val bankAccounts = mutableListOf<BankAccount>()

	fun addBankAccount(bankAccount: BankAccount) = bankAccounts.add(bankAccount)

	fun findBankAccount(clientId: Int) = bankAccounts.find { it.clientId == clientId }
}
