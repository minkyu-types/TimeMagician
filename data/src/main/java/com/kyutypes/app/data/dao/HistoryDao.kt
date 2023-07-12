package com.kyutypes.app.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.kyutypes.app.data.entity.HistoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Query("SELECT * FROM history")
    fun getAll(): Flow<List<HistoryEntity>>

    @Query("SELECT * FROM history WHERE id=:id")
    fun get(id: Long): Flow<HistoryEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun create(history: HistoryEntity): Unit

    @Update
    fun update(history: HistoryEntity): Unit

    @Query("DELETE FROM history WHERE id=:id")
    fun delete(id: Long): Unit
}