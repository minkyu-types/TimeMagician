package com.kyutypes.app.data.repo

import com.kyutypes.app.data.datasource.HistoryDataSource
import com.kyutypes.app.data.db.LocalDatabase
import com.kyutypes.app.data.entity.HistoryEntity
import com.kyutypes.app.data.mapper.HistoryMapper
import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class HistoryRepositoryImpl @Inject constructor(
    private val historyDataSource: HistoryDataSource,
    private val historyMapper: HistoryMapper
): HistoryRepository {
    override fun getAllHistories(): Flow<List<HistoryModel>> {
        return historyDataSource
            .getAllHistories()
            .map { it.map(historyMapper::toModel) }
    }

    override fun getHistory(id: Long): Flow<HistoryModel> {
        return historyDataSource
            .getHistory(id)
            .map { historyMapper.toModel(it) }
    }

    override fun createHistory(historyModel: HistoryModel) {
        val historyEntity = historyMapper.toEntity(historyModel)
        return historyDataSource
            .createHistory(historyEntity)

    }

    override fun updateHistory(history: HistoryModel) {
        TODO("Not yet implemented")
    }

    override fun deleteHistory(id: Long) {
        TODO("Not yet implemented")
    }
}