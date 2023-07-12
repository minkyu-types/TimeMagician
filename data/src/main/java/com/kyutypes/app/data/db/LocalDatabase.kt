package com.kyutypes.app.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kyutypes.app.data.dao.HistoryDao
import com.kyutypes.app.data.entity.HistoryEntity
import javax.inject.Singleton

@Singleton
@Database(entities = [HistoryEntity::class], version = 1)
abstract class LocalDatabase: RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}