package com.kyutypes.app.data.mapper

import com.kyutypes.app.data.entity.HistoryEntity
import com.kyutypes.app.domain.model.HistoryModel

class HistoryMapper {
    fun toEntity(historyModel: HistoryModel): HistoryEntity {
        return HistoryEntity(
            id = historyModel.id,
            sourceTimeZone = historyModel.sourceTimeZone,
            targetTimeZone = historyModel.sourceTimeZone,
            sourceTime = historyModel.sourceTimeZone,
            targetTime = historyModel.sourceTimeZone,
        )
    }

    fun toModel(historyEntity: HistoryEntity): HistoryModel {
        return HistoryModel(
            id = historyEntity.id,
            sourceTimeZone = historyEntity.sourceTimeZone,
            targetTimeZone = historyEntity.sourceTimeZone,
            sourceTime = historyEntity.sourceTimeZone,
            targetTime = historyEntity.sourceTimeZone,
        )
    }
}