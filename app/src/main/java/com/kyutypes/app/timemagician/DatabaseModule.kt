package com.kyutypes.app.timemagician

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.kyutypes.app.data.db.LocalDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideLocalDatabase(
        @ApplicationContext context: Context,
        gson: Gson
    ):  LocalDatabase {
        return Room
            .databaseBuilder(context, LocalDatabase::class.java, "encrypted-db")
            .build()
    }

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()
}