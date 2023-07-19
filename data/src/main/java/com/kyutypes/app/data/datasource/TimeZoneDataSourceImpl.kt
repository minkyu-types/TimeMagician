package com.kyutypes.app.data.datasource

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


class TimeZoneDataSourceImpl: TimeZoneDataSource {
    override fun convertTimeZone(source: TimeZoneModel, target: TimeZoneModel): TimeZoneModel {
        TODO("Not yet implemented")
    }
}

fun main() = runBlocking {
    GlobalScope.launch {

    }
    CoroutineScope(Dispatchers.Main).launch {

    }
    supervisorScope {

    }
}