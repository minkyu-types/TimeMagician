package com.kyutypes.app.timemagician

import com.kyutypes.app.data.repo.HistoryRepositoryImpl
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
}