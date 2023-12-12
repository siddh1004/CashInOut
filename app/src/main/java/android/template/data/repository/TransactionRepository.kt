package android.template.data.repository

import android.template.data.local.dao.TransactionDao
import android.template.data.local.entity.Transaction
import android.template.data.repository.base.BaseRepository
import javax.inject.Inject

class TransactionRepository @Inject constructor(
  private val transactionDao: TransactionDao
) : BaseRepository {
  fun getAll() {
    transactionDao.getAll()
  }

  suspend fun insert(item: Transaction) {
    transactionDao.insert(item)
  }
}