package com.valimade.streamflix.profile.data.mapper

import com.valimade.streamflix.profile.data.model.ProfileData
import com.valimade.streamflix.profile.data.model.ProfileSuggestionData
import com.valimade.streamflix.profile.data.model.ViewedFilmsData
import com.valimade.streamflix.profile.domain.model.Profile
import com.valimade.streamflix.profile.domain.model.ProfileSuggestion
import com.valimade.streamflix.profile.domain.model.ViewedFilms

object ProfileMapper {
    fun profileSuggestionDataToDomain(profileSuggestion: ProfileSuggestionData): ProfileSuggestion {
        return ProfileSuggestion(
            idProfile = profileSuggestion.idProfile,
            avatar = profileSuggestion.avatar,
            name = profileSuggestion.name,
        )
    }

    fun profileDataToDomain(profile: ProfileData): Profile {
        return Profile(
            idProfile = profile.idProfile,
            avatar = profile.avatar,
            name = profile.name,
            watchList = profile.watchList,
            favoriteList = profile.favoriteList,
            viewedFilmsList = profile.viewedFilmsList.map {
                viewedFilmsDataToDomain(it)
            },
        )
    }

    fun viewedFilmsDataToDomain(viewedFilms: ViewedFilmsData): ViewedFilms {
        return ViewedFilms(
            idFilms = viewedFilms.idFilms,
            manyWatchedSec = viewedFilms.manyWatchedSec,
        )
    }
}