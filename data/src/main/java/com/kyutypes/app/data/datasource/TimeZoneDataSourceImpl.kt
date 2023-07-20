package com.kyutypes.app.data.datasource

import com.kyutypes.app.data.TimeZoneConverter
import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlin.system.measureTimeMillis


class TimeZoneDataSourceImpl(
    private val timeZoneConverter: TimeZoneConverter
): TimeZoneDataSource {
    override fun convertTimeZone(source: TimeZoneModel, target: String): TimeZoneModel {
        return timeZoneConverter
            .convert(source, target)
    }

    override fun saveTimeZone(source: TimeZoneModel) {
        timeZoneConverter
            .save(source)
    }

    override fun getSavedTimeZone(): TimeZoneModel {
        return timeZoneConverter
            .get()
    }
}