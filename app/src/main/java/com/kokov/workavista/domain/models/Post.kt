package com.kokov.workavista.domain.models

import java.time.LocalDateTime

data class Post(

    val id: Int,
    val authorId: Int,
    val authorAvatar: String,
    val author: String,
    val published: LocalDateTime,
    val attachment: Attachment?,
    val content: String,
    val link: String?,
    val likes: Int,
    val likedByMe: Boolean,
    val shares: Int,

    )

