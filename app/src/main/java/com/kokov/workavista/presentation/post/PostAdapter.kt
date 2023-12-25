package com.kokov.workavista.presentation.post

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.kokov.workavista.domain.models.Post
import com.kokov.workavista.data.PostRepositoryImpl
import com.kokov.workavista.databinding.CardPostBinding

class PostsAdapter() : ListAdapter<Post, PostViewHolder>(PostDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = CardPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = getItem(position)
        holder.bind(post)
    }

    override fun getItemCount(): Int = PostRepositoryImpl().posts.size

}