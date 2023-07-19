package com.kyutypes.app.domain.repository

import com.kyutypes.app.domain.model.TimeZoneModel

interface TimeZoneRepository {
    fun convertTimeZone(source: TimeZoneModel, target: TimeZoneModel)
    fun saveTimeZone(source: TimeZoneModel)
    fun getSavedTimeZone(): TimeZoneModel?
}