package android.template.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaction")
data class Transaction(
  val date: String,
) {
  @PrimaryKey(autoGenerate = true)
  var uid: Int = 0
}