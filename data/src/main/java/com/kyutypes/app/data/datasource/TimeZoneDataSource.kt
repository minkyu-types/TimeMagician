package com.kyutypes.app.data.datasource

import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.flow.Flow

interface TimeZoneDataSource {
    fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel
    suspend fun saveTimeZone(source: TimeZoneModel)
    suspend fun getSavedTimeZone(): Flow<TimeZoneModel?>
}