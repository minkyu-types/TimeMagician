package com.kyutypes.app.domain.usecase

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository

class GetHistoryUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(id: Long): HistoryModel {
        return historyRepository.getHistory(id)
    }
}