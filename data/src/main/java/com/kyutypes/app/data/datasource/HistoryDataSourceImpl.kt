package com.kyutypes.app.data.datasource

import com.kyutypes.app.data.db.LocalDatabase
import com.kyutypes.app.data.entity.HistoryEntity
import kotlinx.coroutines.flow.Flow

class HistoryDataSourceImpl(
    private val localDatabase: LocalDatabase
): HistoryDataSource {
    override fun getAllHistories(): Flow<List<HistoryEntity>> {
        return localDatabase
            .historyDao()
            .getAll()
    }

    override fun getHistory(id: Long): Flow<HistoryEntity> {
        return localDatabase
            .historyDao()
            .get(id)
    }

    override fun createHistory(history: HistoryEntity) {
        return localDatabase
            .historyDao()
            .create(history)
    }

    override fun updateHistory(history: HistoryEntity) {
        return localDatabase
            .historyDao()
            .update(history)
    }

    override fun deleteHistory(id: Long) {
        return localDatabase
            .historyDao()
            .delete(id)
    }
}