package org.example.lawngarden.domain.users.dto

data class RegisterRequestDto(
    var username: String,
    var password: String,
    var email: String,
)