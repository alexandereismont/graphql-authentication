package com.example.graphql.service

import com.example.graphql.dto.Client
import org.springframework.stereotype.Component

@Component
class ClientService {

	val clientsMemory = mutableListOf<Client>()

	fun addClient(client: Client) = clientsMemory.add(client)

	fun getClients() = clientsMemory

	fun findClient(id: Int) = clientsMemory.find { it.id == id }
}
