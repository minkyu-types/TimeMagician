package com.kyutypes.app.domain.model

data class ConversionModel(
    val sourceTimeZone: String,
    val sourceTime: String,
    val targetTimeZone: String,
    val targetTime: String
)
