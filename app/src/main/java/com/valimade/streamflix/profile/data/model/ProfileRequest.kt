package com.valimade.streamflix.profile.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ProfileRequest(
    val idProfile: String
)