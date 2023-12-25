package com.kokov.workavista.domain.repositories

import androidx.lifecycle.LiveData
import com.kokov.workavista.domain.models.Post

interface PostRepository {
    fun getAllPosts(): LiveData<List<Post>>

}