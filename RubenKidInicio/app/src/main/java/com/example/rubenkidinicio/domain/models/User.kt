package com.example.rubenkidinicio.domain.models

data class User(
    val id: String,
    val name: String,
    val email: String,
    val profileImage: String? = null
)
