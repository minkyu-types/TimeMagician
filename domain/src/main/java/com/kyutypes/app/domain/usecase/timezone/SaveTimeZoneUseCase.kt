package com.kyutypes.app.domain.usecase.timezone

import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository

class SaveTimeZoneUseCase(
    private val timeZoneRepository: TimeZoneRepository
) {
    suspend fun execute(source: TimeZoneModel): Unit {
        return timeZoneRepository
            .saveTimeZone(source)
    }
}