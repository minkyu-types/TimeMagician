package com.kyutypes.app.timemagician

import com.kyutypes.app.data.TimeZoneConverter
import com.kyutypes.app.data.datasource.HistoryDataSource
import com.kyutypes.app.data.datasource.HistoryDataSourceImpl
import com.kyutypes.app.data.datasource.TimeZoneDataSource
import com.kyutypes.app.data.datasource.TimeZoneDataSourceImpl
import com.kyutypes.app.data.db.LocalDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    // DataStore 주입 메서드 작성


    @Provides
    fun provideHistoryDataSource(localDatabase: LocalDatabase): HistoryDataSource {
        return HistoryDataSourceImpl(localDatabase)
    }

    @Provides
    fun provideTimeZoneDataSource(timeZoneConverter: TimeZoneConverter): TimeZoneDataSource {
        return TimeZoneDataSourceImpl(timeZoneConverter)
    }
}