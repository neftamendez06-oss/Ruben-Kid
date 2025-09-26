package com.example.rubenkidinicio.data.repositories

import com.example.rubenkidinicio.data.datasources.UserLocalDataSource
import com.example.rubenkidinicio.domain.models.User
import com.example.rubenkidinicio.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource
) : UserRepository {

    override suspend fun getUser(): User? {
        return userLocalDataSource.getUser()
    }

    override suspend fun saveUser(user: User) {
        userLocalDataSource.saveUser(user)
    }

    override suspend fun deleteUser() {
        userLocalDataSource.deleteUser()
    }
}
