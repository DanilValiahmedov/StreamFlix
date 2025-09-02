package com.valimade.streamflix.profile.domain.model

data class Profile(
    val idProfile: String,
    val avatar: String,
    val name: String,
    val watchList: List<String>,
    val favoriteList: List<String>,
    val viewedFilmsList: List<ViewedFilms>,
)

data class ViewedFilms(
    val idFilms: String,
    val manyWatchedSec: Int, //Сколько посмотрел фильма в секундах
)