package com.kyutypes.app.domain.repository

import com.kyutypes.app.domain.model.TimeZoneModel

interface TimeZoneRepository {
    fun convertTimeZone(source: TimeZoneModel, target: TimeZoneModel): TimeZoneModel
    fun saveTimeZone(source: TimeZoneModel): Unit
    fun getSavedTimeZone(): TimeZoneModel?
}