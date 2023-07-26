package com.kyutypes.app.domain.usecase.history

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository

class UpdateHistoryUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(history: HistoryModel): Unit {
        return historyRepository.updateHistory(history)
    }
}