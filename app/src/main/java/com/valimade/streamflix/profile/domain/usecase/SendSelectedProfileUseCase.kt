package com.valimade.streamflix.profile.domain.usecase

import com.valimade.streamflix.profile.domain.model.Profile
import com.valimade.streamflix.profile.domain.repository.ProfileRepository

class SendSelectedProfileUseCase(private val repository: ProfileRepository) {
    suspend operator fun invoke(idProfile: String): Profile {
        return repository.sendSelectedProfile(idProfile)
    }
}