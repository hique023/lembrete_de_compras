package com.example.lembretedecompras.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lembretedecompras.models.RequestState
import com.example.lembretedecompras.models.Usuario
import com.example.lembretedecompras.repository.UsuarioRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val usuarioRepository = UsuarioRepository(application)

    val loginState = MutableLiveData<RequestState<String>>()

    val usuarioLogadoState = MutableLiveData<RequestState<String>>()

    fun getUsuarioLogado() {
        usuarioLogadoState.value = usuarioRepository.getUsuarioLogado().value
    }

    fun logar(usuario: Usuario) {
        loginState.value = usuarioRepository.logar(usuario).value
    }

}
