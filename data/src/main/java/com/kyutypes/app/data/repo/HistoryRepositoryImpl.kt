package com.kyutypes.app.data.repo

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow

class HistoryRepositoryImpl: HistoryRepository {
    override fun getAllHistories(): Flow<HistoryModel> {
        TODO("Not yet implemented")
    }

    override fun getHistory(id: Long): HistoryModel {
        TODO("Not yet implemented")
    }

    override fun createHistory(history: HistoryModel) {
        TODO("Not yet implemented")
    }

    override fun updateHistory(history: HistoryModel) {
        TODO("Not yet implemented")
    }

    override fun deleteHistory(id: Long) {
        TODO("Not yet implemented")
    }
}