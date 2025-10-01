package org.example.lawngarden.domain.auths.dto

import org.example.lawngarden.dto.UserDetailResponseDto

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val user: UserDetailResponseDto
)
