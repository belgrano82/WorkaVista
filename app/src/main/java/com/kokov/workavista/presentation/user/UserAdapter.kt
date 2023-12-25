package com.kokov.workavista.presentation.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.kokov.workavista.data.UserRepositoryImpl
import com.kokov.workavista.databinding.CardUserBinding
import com.kokov.workavista.domain.models.User

class UserAdapter() : ListAdapter<User, UserViewHolder>(UserDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = CardUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = getItem(position)
        holder.bind(user)
    }

    override fun getItemCount(): Int = UserRepositoryImpl().users.size

}