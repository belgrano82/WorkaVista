package com.kokov.workavista.presentation.post

import androidx.lifecycle.ViewModel
import com.kokov.workavista.data.PostRepositoryImpl
import com.kokov.workavista.domain.repositories.PostRepository

class PostViewModel : ViewModel() {
    private val repository: PostRepository = PostRepositoryImpl()
    val data = repository.getAllPosts()
}