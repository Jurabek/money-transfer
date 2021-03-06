package domain.transaction

import java.util.*

interface TransactionInfoRepository {
    fun getById(id: UUID): TransactionInfo
    fun getAll(): Collection<TransactionInfo>
    suspend fun add(transactionInfo: TransactionInfo): TransactionInfo
    suspend fun update(transactionInfo: TransactionInfo): TransactionInfo
}