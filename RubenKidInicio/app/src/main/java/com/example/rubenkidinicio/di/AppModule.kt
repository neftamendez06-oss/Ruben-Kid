package com.example.rubenkidinicio.di

import android.content.Context
import com.example.rubenkidinicio.data.datasources.UserLocalDataSource
import com.example.rubenkidinicio.data.datasources.UserLocalDataSourceImpl
import com.example.rubenkidinicio.data.repositories.UserRepositoryImpl
import com.example.rubenkidinicio.domain.repositories.UserRepository
import com.example.rubenkidinicio.domain.usecases.GetUserUseCase
import com.example.rubenkidinicio.domain.usecases.SaveUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserLocalDataSource(
        @ApplicationContext context: Context
    ): UserLocalDataSource = UserLocalDataSourceImpl(context)

    @Provides
    @Singleton
    fun provideUserRepository(
        userLocalDataSource: UserLocalDataSource
    ): UserRepository = UserRepositoryImpl(userLocalDataSource)

    @Provides
    fun provideGetUserUseCase(
        userRepository: UserRepository
    ): GetUserUseCase = GetUserUseCase(userRepository)

    @Provides
    fun provideSaveUserUseCase(
        userRepository: UserRepository
    ): SaveUserUseCase = SaveUserUseCase(userRepository)
}
