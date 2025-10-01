package org.example.lawngarden.common.exception.custom

class UserExistException(
    message : String = "존재하는 이름입니다."
) : RuntimeException(message)