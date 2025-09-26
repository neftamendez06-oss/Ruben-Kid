package com.example.rubenkidinicio.domain.usecases

import com.example.rubenkidinicio.domain.models.User
import com.example.rubenkidinicio.domain.repositories.UserRepository
import javax.inject.Inject

class SaveUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(user: User) {
        userRepository.saveUser(user)
    }
}
