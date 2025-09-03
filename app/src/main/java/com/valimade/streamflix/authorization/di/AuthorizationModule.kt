package com.valimade.streamflix.authorization.di

import com.valimade.streamflix.authorization.data.repository.AuthorizationRepositoryImpl
import com.valimade.streamflix.authorization.domain.repository.AuthorizationRepository
import com.valimade.streamflix.authorization.domain.usecase.GetPhoneUseCase
import com.valimade.streamflix.authorization.domain.usecase.SavePhoneUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authorizationModule = module {
    single<AuthorizationRepository> {
        AuthorizationRepositoryImpl(
            context = get(),
        )
    }

    singleOf(::GetPhoneUseCase)
    singleOf(::SavePhoneUseCase)
}