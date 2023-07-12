package com.kyutypes.app.data.datasource

import com.kyutypes.app.data.entity.HistoryEntity
import kotlinx.coroutines.flow.Flow

interface HistoryDataSource {
    fun getAllHistories(): Flow<List<HistoryEntity>>
    fun getHistory(id: Long): Flow<HistoryEntity>
    fun createHistory(history: HistoryEntity): Unit
    fun updateHistory(history: HistoryEntity): Unit
    fun deleteHistory(id: Long): Unit
}