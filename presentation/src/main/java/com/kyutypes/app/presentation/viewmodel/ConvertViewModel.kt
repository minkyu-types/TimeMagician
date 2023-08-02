package com.kyutypes.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kyutypes.app.domain.model.ConversionModel
import com.kyutypes.app.domain.model.HistoryModel
import com.kyutypes.app.domain.usecase.timezone.TimeZoneUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConvertViewModel @Inject constructor(
    private val timeZoneUseCases: TimeZoneUseCases
): ViewModel() {
    private val _eventFlow = MutableSharedFlow<Event>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun showToast() {
        event(Event.ShowToast(""))
    }

    fun selectDate() {
        event(Event.SelectDate(""))
    }

    fun selectTime() {
        event(Event.SelectTime(""))
    }

    fun selectTimeZone() {
        event(Event.SelectTimeZone(""))
    }

    fun convertTime() {
        event(Event.ConvertTime(TODO()))
    }

    private fun event(event: Event) {
        viewModelScope.launch {
            _eventFlow.emit(event)
        }
    }

    sealed class Event {
        data class ShowToast(val text: String): Event()
        data class SelectDate(val date: String): Event()
        data class SelectTime(val time: String): Event()
        data class SelectTimeZone(val timezone: String): Event()
        data class ConvertTime(val data: ConversionModel): Event()
    }
}