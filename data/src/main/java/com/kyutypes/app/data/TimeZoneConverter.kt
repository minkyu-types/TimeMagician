package com.kyutypes.app.data

import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TimeZoneConverter @Inject constructor(

) {
    fun convert(source: TimeZoneModel, target: String): TimeZoneModel {
        return TODO()
    }

    fun save(source: TimeZoneModel): Unit {
        TODO()
    }

    fun get(): Flow<TimeZoneModel?> {
        return TODO()
    }
}