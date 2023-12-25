package com.kokov.workavista.domain.models

import java.time.LocalDateTime

data class Event(

    val id: Int,
    val authorId: Int,
    val author: String,
    val authorJob: String,
    val authorAvatar: String,
    val content: String,
    val dateTime: LocalDateTime,
    val published: LocalDateTime,
    val coordinates: Coordinates?,
    val type: EventType,
    val likeOwnerIds: List<Int>?,
    val likedByMe: Boolean,
    val speakersIds: List<Int>?,
    val participantsIds: List<Int>?,
    val participatedByMe: Boolean,
    val attachment: Attachment,
    val likes: Int,
    val shares: Int,
    val link: String,
    val users: User?,

    )


