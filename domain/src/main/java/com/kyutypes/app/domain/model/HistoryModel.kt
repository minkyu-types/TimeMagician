package com.kyutypes.app.domain.model

data class HistoryModel(
    val id: Long,
    val sourceTimeZone: String,
    val targetTimeZone: String,
    val sourceTime: String,
    val targetTime: String
)