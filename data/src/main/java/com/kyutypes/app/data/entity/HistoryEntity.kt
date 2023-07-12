package com.kyutypes.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history")
data class HistoryEntity(
    @PrimaryKey val id: Long,
    val sourceTimeZone: String,
    val targetTimeZone: String,
    val sourceTime: String,
    val targetTime: String
)
