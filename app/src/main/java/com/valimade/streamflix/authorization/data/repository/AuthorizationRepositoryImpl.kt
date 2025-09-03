package com.valimade.streamflix.authorization.data.repository

import android.content.Context
import com.valimade.streamflix.authorization.domain.repository.AuthorizationRepository
import androidx.core.content.edit

class AuthorizationRepositoryImpl(
    private val context: Context
): AuthorizationRepository {
    companion object {
        const val AUTH = "auth"
        const val PHONE = "phone"
    }

    private val preferences = context.getSharedPreferences(AUTH, Context.MODE_PRIVATE)

    override fun getPhone(): String? {
        return preferences.getString(PHONE, "")
    }

    override fun savePhone(phone: String) {
        preferences.edit { putString(PHONE, phone) }
    }
}