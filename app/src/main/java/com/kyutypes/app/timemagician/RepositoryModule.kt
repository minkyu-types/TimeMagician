package com.kyutypes.app.timemagician

import com.kyutypes.app.data.repo.HistoryRepositoryImpl
import com.kyutypes.app.domain.repository.HistoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideHistoryRepository(historyRepositoryImpl: HistoryRepositoryImpl): HistoryRepository {
        return historyRepositoryImpl
    }
}