package com.kyutypes.app.data.datasource

import com.kyutypes.app.domain.model.TimeZoneModel

interface TimeZoneDataSource {
    fun convertTimeZone(source: TimeZoneModel, target: TimeZoneModel): TimeZoneModel
}