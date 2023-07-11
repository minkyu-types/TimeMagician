package com.kyutypes.app.presentation

import androidx.lifecycle.ViewModel
import com.kyutypes.app.domain.repository.HistoryRepository
import com.kyutypes.app.domain.usecase.HistoryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val historyUseCases: HistoryUseCases
): ViewModel() {
    private val _uiState = MutableStateFlow(0)
    val uiState: Flow<Int> = _uiState.asStateFlow()
}