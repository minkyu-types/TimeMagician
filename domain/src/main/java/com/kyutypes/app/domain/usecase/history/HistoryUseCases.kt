package com.kyutypes.app.domain.usecase.history

import com.kyutypes.app.domain.repository.HistoryRepository

class HistoryUseCases(
    private val historyRepository: HistoryRepository
) {
    fun getAllHistories(): GetAllHistoriesUseCase {
        return GetAllHistoriesUseCase(historyRepository)
    }
    fun getHistoryById(): GetHistoryUseCase {
        return GetHistoryUseCase(historyRepository)
    }
    fun createHistory(): CreateHistoryUseCase {
        return CreateHistoryUseCase(historyRepository)
    }
    fun updateHistory(): UpdateHistoryUseCase {
        return UpdateHistoryUseCase(historyRepository)
    }
    fun deleteHistory() : DeleteHistoryUseCase {
        return DeleteHistoryUseCase(historyRepository)
    }
}