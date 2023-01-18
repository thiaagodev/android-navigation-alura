package br.com.alura.aluraesporte.repository

import android.content.SharedPreferences
import androidx.core.content.edit

private const val CHAVE_LOGADO = "LOGADO"

class LoginRepository(private val preferences: SharedPreferences) {

    fun loga() = salva(true)

    fun estaLogado(): Boolean = preferences.getBoolean(CHAVE_LOGADO, false)

    fun deslogar() = salva(false)

    fun salva(estado: Boolean) {
        preferences.edit {
            putBoolean(CHAVE_LOGADO, estado)
        }
    }

}
