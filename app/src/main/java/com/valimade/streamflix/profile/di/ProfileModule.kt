package com.valimade.streamflix.profile.di

import com.valimade.streamflix.profile.data.mapper.ProfileMapper
import com.valimade.streamflix.profile.data.repository.ProfileRepositoryImpl
import com.valimade.streamflix.profile.domain.repository.ProfileRepository
import com.valimade.streamflix.profile.domain.usecase.GetAllProfileUseCase
import com.valimade.streamflix.profile.domain.usecase.SendSelectedProfileUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val profileModule = module {
    single {ProfileMapper}

    single<ProfileRepository> {
        ProfileRepositoryImpl(
            httpClient = get(),
            mapper = get(),
        )
    }

    singleOf(::GetAllProfileUseCase)
    singleOf(::SendSelectedProfileUseCase)
}