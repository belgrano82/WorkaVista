package com.kokov.workavista.presentation.user

import androidx.lifecycle.ViewModel
import com.kokov.workavista.data.UserRepositoryImpl
import com.kokov.workavista.domain.repositories.UserRepository

class UserViewModel: ViewModel() {
    private val repository: UserRepository = UserRepositoryImpl()
    val data = repository.getAllUsers()
}