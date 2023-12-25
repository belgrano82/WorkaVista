package com.kokov.workavista.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kokov.workavista.domain.models.Attachment
import com.kokov.workavista.domain.models.AttachmentType
import com.kokov.workavista.domain.models.Post
import com.kokov.workavista.domain.repositories.PostRepository
import java.time.LocalDateTime

class PostRepositoryImpl : PostRepository {

     var posts = listOf<Post>()

    private val names = listOf<String>("Marta", "John", "Alex", "Nick", "Jane")
    private val surnames = listOf<String>("Smith", "Brown", "Tramp", "King", "Miller")
    private val numbers = IntArray(1001) {it}

    init {
        for (i in 0 until 100) {
            val post = Post(
                id = i,
                authorId = i + 10,
                authorAvatar = "sampledata/avatar.jpg",
                author = "${names.random()} ${surnames.random()}",
                content = "post # $i",
                likedByMe = false,
                attachment = Attachment("", type = AttachmentType.entries.random()),
                likes = numbers.random(),
                published = LocalDateTime.now(),
                link = null,
                shares = numbers.random()
            )
            posts += post
        }
    }

    private val data = MutableLiveData(posts)

    override fun getAllPosts(): LiveData<List<Post>> = data

}