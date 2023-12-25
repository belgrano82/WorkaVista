package com.kokov.workavista.presentation.post

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kokov.workavista.domain.models.AttachmentType
import com.kokov.workavista.domain.models.Post
import com.kokov.workavista.R
import com.kokov.workavista.databinding.CardPostBinding

class PostViewHolder(
    private val binding: CardPostBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: Post) {

        binding.apply {

            textAuthor.text = post.author
            textPublished.text = post.published.toString()
            textPostContent.text = post.content
            textNumberOfLikes.text = post.likes.toString()
            textNumberOfShares.text = post.shares.toString()
            imageAvatar.setImageResource(R.drawable.avatar)
            imagePostImage.setImageResource(R.drawable.avatar)

            setAttachment(post)

        }

    }

    private fun CardPostBinding.setAttachment(post: Post) {
        val attachmentType = post.attachment?.type


        imagePostImage.visibility = when (attachmentType) {
            AttachmentType.IMAGE -> View.VISIBLE
            else -> View.GONE
        }

        groupVideo.visibility = when (attachmentType) {
            AttachmentType.VIDEO -> View.VISIBLE
            else -> View.GONE
        }

        groupAudio.visibility = when (attachmentType) {
            AttachmentType.AUDIO -> View.VISIBLE
            else -> View.GONE
        }
    }
}