package com.kyutypes.app.data.datasource

import com.kyutypes.app.data.entity.HistoryEntity
import kotlinx.coroutines.flow.Flow

class HistoryDataSourceImpl: HistoryDataSource {
    override fun getAllHistories(): Flow<List<HistoryEntity>> {
        TODO("Not yet implemented")
    }

    override fun getHistory(id: Long): Flow<HistoryEntity> {
        TODO("Not yet implemented")
    }

    override fun createHistory(history: HistoryEntity) {
        TODO("Not yet implemented")
    }

    override fun updateHistory(history: HistoryEntity) {
        TODO("Not yet implemented")
    }

    override fun deleteHistory(id: Long) {
        TODO("Not yet implemented")
    }
}