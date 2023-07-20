package com.kyutypes.app.data.repo

import com.kyutypes.app.data.datasource.TimeZoneDataSource
import com.kyutypes.app.domain.model.TimeZoneModel
import com.kyutypes.app.domain.repository.TimeZoneRepository

class TimeZoneRepositoryImpl(
    private val timeZoneDataSource: TimeZoneDataSource
): TimeZoneRepository {
    override fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel {
        return timeZoneDataSource
            .convertTimeZone(source, target)
    }

    override fun saveTimeZone(source: TimeZoneModel) {
        timeZoneDataSource.saveTimeZone(source)
    }

    override fun getSavedTimeZone(): TimeZoneModel? {
        return timeZoneDataSource
            .getSavedTimeZone()
    }
}