package com.kyutypes.app.domain.usecase.timezone

import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository
import kotlinx.coroutines.flow.Flow

class GetSavedTimeZoneUseCase(
    private val timeZoneRepository: TimeZoneRepository
) {
    suspend fun execute(): Flow<TimeZoneModel?> {
        return timeZoneRepository
            .getSavedTimeZone()
    }
}