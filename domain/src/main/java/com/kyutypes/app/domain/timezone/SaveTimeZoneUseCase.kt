package com.kyutypes.app.domain.timezone

import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository

class SaveTimeZoneUseCase(
    private val timeZoneRepository: TimeZoneRepository
) {
    fun execute(source: TimeZoneModel): Unit {
        return timeZoneRepository
            .saveTimeZone(source)
    }
}