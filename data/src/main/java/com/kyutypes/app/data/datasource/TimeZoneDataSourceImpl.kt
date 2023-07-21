package com.kyutypes.app.data.datasource

import com.kyutypes.app.data.TimeZoneConverter
import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TimeZoneDataSourceImpl @Inject constructor(
    private val timeZoneConverter: TimeZoneConverter
): TimeZoneDataSource {
    override fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel {
        return timeZoneConverter
            .convert(source, target)
    }

    override suspend fun saveTimeZone(source: TimeZoneModel): Unit {
        timeZoneConverter
            .save(source)
    }

    override suspend fun getSavedTimeZone(): Flow<TimeZoneModel?> {
        return timeZoneConverter
            .get()
    }
}