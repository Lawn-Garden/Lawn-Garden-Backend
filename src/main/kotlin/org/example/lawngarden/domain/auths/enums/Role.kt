package org.example.lawngarden.domain.auths.enums

enum class Role(private val displayName: String) {
    USER("잔디 관리인"),
    ADMIN("운영자");

    fun getDisplayName(): String = displayName
}
