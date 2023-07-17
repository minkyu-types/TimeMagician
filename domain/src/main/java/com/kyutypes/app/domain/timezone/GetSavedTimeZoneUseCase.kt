package com.kyutypes.app.domain.timezone

import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository

class GetSavedTimeZoneUseCase(
    private val timeZoneRepository: TimeZoneRepository
) {
    fun execute(): TimeZoneModel? {
        return timeZoneRepository
            .getSavedTimeZone()
    }
}