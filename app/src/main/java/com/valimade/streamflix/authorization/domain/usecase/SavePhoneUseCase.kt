package com.valimade.streamflix.authorization.domain.usecase

import com.valimade.streamflix.authorization.domain.repository.AuthorizationRepository

class SavePhoneUseCase(private val repository: AuthorizationRepository) {
    operator fun invoke(phone: String) = repository.savePhone(phone)
}