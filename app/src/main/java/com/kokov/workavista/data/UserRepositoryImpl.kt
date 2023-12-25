package com.kokov.workavista.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kokov.workavista.domain.models.User
import com.kokov.workavista.domain.repositories.UserRepository

class UserRepositoryImpl: UserRepository {

    var users = listOf<User>()


    private val names = listOf<String>("Marta", "John", "Alex", "Nick", "Jane")
    private val surnames = listOf<String>("Smith", "Brown", "Tramp", "King", "Miller")

    init {
        for (i in 0..100) {
            val user = User(
                id = i,
                name = "${names.random()} ${surnames.random()}",
                avatar = "",
                nickname = "${i}sk${i}fjlf${i}"
            )

            users += user
        }
    }

    private val data = MutableLiveData(users)

    override fun getAllUsers(): LiveData<List<User>> = data
}