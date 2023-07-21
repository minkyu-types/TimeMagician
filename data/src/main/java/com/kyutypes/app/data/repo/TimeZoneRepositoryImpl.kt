package com.kyutypes.app.data.repo

import com.kyutypes.app.data.datasource.TimeZoneDataSource
import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TimeZoneRepositoryImpl @Inject constructor(
    private val timeZoneDataSource: TimeZoneDataSource
): TimeZoneRepository {
    override fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel {
        return timeZoneDataSource
            .convertTimeZone(source, target)
    }

    override suspend fun saveTimeZone(source: TimeZoneModel) {
        timeZoneDataSource.saveTimeZone(source)
    }

    override suspend fun getSavedTimeZone(): Flow<TimeZoneModel?> {
        return timeZoneDataSource
            .getSavedTimeZone()
    }
}