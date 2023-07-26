package com.kyutypes.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.kyutypes.app.domain.usecase.timezone.TimeZoneUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ConvertViewModel @Inject constructor(
    private val timeZoneUseCases: TimeZoneUseCases
): ViewModel() {
    private val _uiState = MutableStateFlow(0)
    val uiState: Flow<Int> = _uiState.asStateFlow()
}