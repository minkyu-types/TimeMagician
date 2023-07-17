package com.kyutypes.app.domain.repository

import com.kyutypes.app.domain.model.TimeZoneModel

interface TimeZoneRepository {
    fun getSavedTimeZone(): TimeZoneModel?
    fun saveTimeZone(timezone: TimeZoneModel)
    fun convertTimeZone(source: TimeZoneModel, target: TimeZoneModel)
}