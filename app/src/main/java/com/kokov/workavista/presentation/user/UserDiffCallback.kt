package com.kokov.workavista.presentation.user

import androidx.recyclerview.widget.DiffUtil
import com.kokov.workavista.domain.models.User

class UserDiffCallback: DiffUtil.ItemCallback<User>() {
    override fun areItemsTheSame(oldItem: User, newItem: User) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: User, newItem: User) = oldItem == newItem
}