package com.kyutypes.app.domain.timezone

import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository

class ConvertTimeZoneUseCase(
    private val timeZoneRepository: TimeZoneRepository
) {
    fun execute(source: TimeZoneModel, target: TimeZoneModel): TimeZoneModel {
        return timeZoneRepository
            .convertTimeZone(source, target)
    }
}