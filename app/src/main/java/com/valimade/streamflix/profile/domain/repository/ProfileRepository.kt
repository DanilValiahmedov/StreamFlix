package com.valimade.streamflix.profile.domain.repository

import com.valimade.streamflix.profile.domain.model.Profile
import com.valimade.streamflix.profile.domain.model.ProfileSuggestion

interface ProfileRepository {
    suspend fun getAllProfile(phone: String): Result<List<ProfileSuggestion>>
    suspend fun sendSelectedProfile(idProfile: String): Profile
}