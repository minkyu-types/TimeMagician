package com.kyutypes.app.domain.usecase.history

import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.repository.HistoryRepository

class CreateHistoryUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(history: HistoryModel): Unit {
        return historyRepository.createHistory(history)
    }
}