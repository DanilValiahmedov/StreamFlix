package com.valimade.streamflix.authorization.domain.usecase

import com.valimade.streamflix.authorization.domain.repository.AuthorizationRepository

class GetPhoneUseCase(private val repository: AuthorizationRepository) {
    operator fun invoke(): String? = repository.getPhone()
}