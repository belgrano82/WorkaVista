package com.kokov.workavista.domain.repositories

import androidx.lifecycle.LiveData
import com.kokov.workavista.domain.models.User

interface UserRepository {
    fun getAllUsers(): LiveData<List<User>>

}