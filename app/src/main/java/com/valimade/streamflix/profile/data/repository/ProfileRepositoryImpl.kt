package com.valimade.streamflix.profile.data.repository

import com.valimade.streamflix.profile.data.mapper.ProfileMapper
import com.valimade.streamflix.profile.data.model.ProfileData
import com.valimade.streamflix.profile.data.model.ProfileSuggestionData
import com.valimade.streamflix.profile.data.model.ProfileSuggestionRequest
import com.valimade.streamflix.profile.domain.model.Profile
import com.valimade.streamflix.profile.domain.model.ProfileSuggestion
import com.valimade.streamflix.profile.domain.repository.ProfileRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class ProfileRepositoryImpl(
    private val httpClient: HttpClient,
    private val mapper: ProfileMapper,
): ProfileRepository {
    override suspend fun getAllProfile(phone: String): Result<List<ProfileSuggestion>> {
        return runCatching {
            val response: List<ProfileSuggestionData> = httpClient.post("/getAllProfile") {
                setBody(ProfileSuggestionRequest(phone))
            }.body()
            response.map {
                mapper.profileSuggestionDataToDomain(it)
            }
        }
    }

    override suspend fun sendSelectedProfile(idProfile: String): Result<Profile> {
        return runCatching {
            val response: ProfileData = httpClient.post("/sendSelectedProfile") {
                setBody(ProfileSuggestionRequest(idProfile))
            }.body()

            mapper.profileDataToDomain(response)
        }
    }
}