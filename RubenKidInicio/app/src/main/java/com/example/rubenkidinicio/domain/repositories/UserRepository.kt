package com.example.rubenkidinicio.domain.repositories

import com.example.rubenkidinicio.domain.models.User

interface UserRepository {
    suspend fun getUser(): User?
    suspend fun saveUser(user: User)
    suspend fun deleteUser()
}
