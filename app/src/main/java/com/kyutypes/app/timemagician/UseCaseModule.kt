package com.kyutypes.app.timemagician

import com.kyutypes.app.data.repo.HistoryRepositoryImpl
import com.kyutypes.app.data.repo.TimeZoneRepositoryImpl
import com.kyutypes.app.domain.timezone.TimeZoneUseCases
import com.kyutypes.app.domain.usecase.HistoryUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideHistoryUseCase(historyRepositoryImpl: HistoryRepositoryImpl): HistoryUseCases {
        return HistoryUseCases(historyRepositoryImpl)
    }

    @Provides
    fun provideTimeZoneUseCase(timeZoneRepositoryImpl: TimeZoneRepositoryImpl): TimeZoneUseCases {
        return TimeZoneUseCases(timeZoneRepositoryImpl)
    }
}