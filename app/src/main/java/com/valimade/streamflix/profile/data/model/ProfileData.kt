package com.valimade.streamflix.profile.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ProfileData(
    val idProfile: String,
    val avatar: String,
    val name: String,
    val watchList: List<String>,
    val favoriteList: List<String>,
    val viewedFilmsList: List<ViewedFilmsData>,
)

@Serializable
data class ViewedFilmsData(
    val idFilms: String,
    val manyWatchedSec: Int,
)