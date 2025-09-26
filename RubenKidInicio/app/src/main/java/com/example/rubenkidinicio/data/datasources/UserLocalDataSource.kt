package com.example.rubenkidinicio.data.datasources

import com.example.rubenkidinicio.domain.models.User

interface UserLocalDataSource {
    suspend fun getUser(): User?
    suspend fun saveUser(user: User)
    suspend fun deleteUser()
}
