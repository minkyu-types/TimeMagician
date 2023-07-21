package com.kyutypes.app.timemagician

import com.kyutypes.app.data.mapper.HistoryMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MapperModule {
    @Provides
    fun provideHistoryMapper(): HistoryMapper {
        return HistoryMapper()
    }
}