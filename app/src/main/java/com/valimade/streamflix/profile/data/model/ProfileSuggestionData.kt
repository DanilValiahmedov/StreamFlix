package com.valimade.streamflix.profile.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ProfileSuggestionData(
    val idProfile: String,
    val avatar: String,
    val name: String,
)