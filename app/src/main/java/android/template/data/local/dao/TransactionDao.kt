package android.template.data.local.dao

import android.template.data.local.entity.Transaction
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {
  @Query("SELECT * FROM `transaction`")
  fun getAll(): Flow<List<Transaction>>

  @Insert
  suspend fun insert(item: Transaction)
}