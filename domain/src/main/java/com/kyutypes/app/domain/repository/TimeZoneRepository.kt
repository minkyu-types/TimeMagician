package com.kyutypes.app.domain.repository

import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.flow.Flow

interface TimeZoneRepository {
    fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel
    suspend fun saveTimeZone(source: TimeZoneModel): Unit
    suspend fun getSavedTimeZone(): Flow<TimeZoneModel?>
}