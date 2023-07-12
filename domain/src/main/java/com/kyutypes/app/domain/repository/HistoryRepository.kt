package com.kyutypes.app.domain.repository

import com.kyutypes.app.domain.model.HistoryModel
import kotlinx.coroutines.flow.Flow

interface HistoryRepository {
    fun getAllHistories(): Flow<List<HistoryModel>>
    fun getHistory(id: Long): Flow<HistoryModel>
    fun createHistory(history: HistoryModel): Unit
    fun updateHistory(history: HistoryModel): Unit
    fun deleteHistory(id: Long): Unit
}