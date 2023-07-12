package com.kyutypes.app.domain.usecase

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow

class GetAllHistoriesUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(): Flow<List<HistoryModel>> {
        return historyRepository.getAllHistories()
    }
}