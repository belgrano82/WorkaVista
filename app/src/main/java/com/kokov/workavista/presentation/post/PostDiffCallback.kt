package com.kokov.workavista.presentation.post

import androidx.recyclerview.widget.DiffUtil
import com.kokov.workavista.domain.models.Post

class PostDiffCallback : DiffUtil.ItemCallback<Post>() {
    override fun areItemsTheSame(oldItem: Post, newItem: Post) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Post, newItem: Post) = oldItem == newItem

}