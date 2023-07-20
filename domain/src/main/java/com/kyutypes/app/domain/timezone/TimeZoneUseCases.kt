package com.kyutypes.app.domain.timezone

import com.kyutypes.app.domain.repository.TimeZoneRepository

class TimeZoneUseCases(
    private val timeZoneRepository: TimeZoneRepository
) {
    fun convertTimeZone(): ConvertTimeZoneUseCase {
        return ConvertTimeZoneUseCase(timeZoneRepository)
    }

    fun saveTimeZone(): SaveTimeZoneUseCase {
        return SaveTimeZoneUseCase(timeZoneRepository)
    }

    fun getTimeZone(): GetSavedTimeZoneUseCase {
        return GetSavedTimeZoneUseCase(timeZoneRepository)
    }
}