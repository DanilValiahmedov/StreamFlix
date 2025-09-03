package com.valimade.streamflix.profile.domain.usecase

import com.valimade.streamflix.authorization.domain.usecase.GetPhoneUseCase
import com.valimade.streamflix.profile.domain.model.ProfileException
import com.valimade.streamflix.profile.domain.model.ProfileSuggestion
import com.valimade.streamflix.profile.domain.repository.ProfileRepository

class GetAllProfileUseCase(
    private val repository: ProfileRepository,
    private val getPhoneUseCase: GetPhoneUseCase,
) {
    suspend operator fun invoke(): Result<List<ProfileSuggestion>> {
        val phone = getPhoneUseCase()
        return if(phone != null) repository.getAllProfile(phone)
            else throw ProfileException.PhoneNotSaved()
    }
}