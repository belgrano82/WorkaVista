package com.kokov.workavista.presentation.user

import androidx.recyclerview.widget.RecyclerView
import com.kokov.workavista.R
import com.kokov.workavista.databinding.CardUserBinding
import com.kokov.workavista.domain.models.User

class UserViewHolder(
    private val binding: CardUserBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(userPreview: User) {

        binding.apply {

            textUser.text = userPreview.name
            textNickname.text = userPreview.nickname
            imageAvatar.setImageResource(R.drawable.avatar)

        }

    }
}