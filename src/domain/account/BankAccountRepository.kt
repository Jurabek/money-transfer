package domain.account

import java.util.*

interface BankAccountRepository {
    fun getById(id: UUID): BankAccount
    fun getAll(): Collection<BankAccount>
    suspend fun add(bankAccount: BankAccount): BankAccount
    suspend fun update(bankAccount: BankAccount): BankAccount
}