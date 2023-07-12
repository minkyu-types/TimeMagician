package com.kyutypes.app.domain.usecase

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository
import kotlinx.coroutines.flow.Flow

class GetHistoryUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(id: Long): Flow<HistoryModel> {
        return historyRepository.getHistory(id)
    }
}