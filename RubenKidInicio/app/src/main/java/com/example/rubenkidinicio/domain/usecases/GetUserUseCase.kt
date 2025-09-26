package com.example.rubenkidinicio.domain.usecases

import com.example.rubenkidinicio.domain.models.User
import com.example.rubenkidinicio.domain.repositories.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(): User? {
        return userRepository.getUser()
    }
}
