package com.valimade.streamflix.authorization.domain.repository

interface AuthorizationRepository {
    fun getPhone(): String?
    fun savePhone(phone: String)
}