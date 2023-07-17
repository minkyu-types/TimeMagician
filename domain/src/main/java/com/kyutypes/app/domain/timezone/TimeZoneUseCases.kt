package com.kyutypes.app.domain.timezone

import com.kyutypes.app.domain.repository.TimeZoneRepository

class TimeZoneUseCases(
    private val timeZoneRepository: TimeZoneRepository
) {
    fun getTimeZone(): GetSavedTimeZoneUseCase {
        return GetSavedTimeZoneUseCase(timeZoneRepository)
    }

    fun convertTimeZone(): ConvertTimeZoneUseCase {
        return ConvertTimeZoneUseCase(timeZoneRepository)
    }
}