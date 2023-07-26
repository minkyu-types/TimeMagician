package com.kyutypes.app.domain.usecase.history

import com.kyutypes.app.domain.repository.HistoryRepository

class DeleteHistoryUseCase(
    private val historyRepository: HistoryRepository
) {
    fun execute(id: Long): Unit {
        return historyRepository.deleteHistory(id)
    }
}