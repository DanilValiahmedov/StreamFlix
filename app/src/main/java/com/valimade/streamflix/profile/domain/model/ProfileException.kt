package com.valimade.streamflix.profile.domain.model

sealed class ProfileException(message: String) : Exception(message) {
    class PhoneNotSaved: ProfileException("Номер телефона не был сохранен")
}