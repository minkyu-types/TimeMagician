package com.kyutypes.app.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import com.kyutypes.app.domain.model.TimeZoneModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class TimeZoneConverter(
    private val dataStore: DataStore<Preferences>
) {
    private val recentLocation = stringPreferencesKey("RecentLocation")
    private val recentTime = stringPreferencesKey("RecentTime")
    private val recentAbbreviation = stringPreferencesKey("RecentAbbreviation")

    var name: String = "Minkyu"
    var surName : String = "Kim"
    val fullName
        get() = "$name $surName"

    fun convert(source: TimeZoneModel, target: String): TimeZoneModel {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val sourceZoneId = ZoneId.of(source.location)
        val targetZoneId = ZoneId.of(target)

        val sourceTime = ZonedDateTime.parse(source.time, formatter).withZoneSameInstant(sourceZoneId)
        val targetTime = sourceTime.withZoneSameInstant(targetZoneId)

        return TimeZoneModel(null, target, formatter.format(targetTime))
    }

    suspend fun save(source: TimeZoneModel): Unit {
        dataStore.edit {
            it[recentLocation].let { source.location }
            it[recentTime] = source.time
            it[recentAbbreviation] = source.abbreviation
        }
    }

    suspend fun get(): Flow<TimeZoneModel?> {
        return dataStore.data
            .catch { exception ->
                if (exception is java.io.IOException) {
                    exception.printStackTrace()
                    emit(emptyPreferences())
                } else {
                    throw exception
                }
            }
            .map { prefs ->
                TimeZoneModel(
                    prefs[recentLocation] ?: "",
                    prefs[recentTime] ?: "",
                    prefs[recentAbbreviation] ?: ""
                )
            }
    }
}