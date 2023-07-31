package com.kyutypes.app.timemagician

import com.kyutypes.app.data.TimeZoneConverter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ConverterModule {

    @Provides
    @Singleton
    fun provideConverter(): TimeZoneConverter = TimeZoneConverter()
}