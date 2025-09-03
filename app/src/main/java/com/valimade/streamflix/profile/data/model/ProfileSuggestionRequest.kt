package com.valimade.streamflix.profile.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ProfileSuggestionRequest(
    val phone: String
)