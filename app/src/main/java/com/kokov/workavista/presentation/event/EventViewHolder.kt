package com.kokov.workavista.presentation.event

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kokov.workavista.R
import com.kokov.workavista.databinding.CardEventBinding
import com.kokov.workavista.domain.models.AttachmentType
import com.kokov.workavista.domain.models.Event
import java.time.LocalDate

class EventViewHolder(
    private val binding: CardEventBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(event: Event) {

        binding.apply {

            textAuthor.text = event.author
            textPublished.text = event.published.toString()
            textEventContent.text = event.content
            textNumberOfLikes.text = event.likes.toString()
            textNumberOfShares.text = event.shares.toString()
            eventType.text = event.type.toString()
            imageAvatar.setImageResource(R.drawable.avatar)
            imageEventImage.setImageResource(R.drawable.avatar)
            eventDate.text = LocalDate.ofYearDay(2024, 35).toString()

            setAttachment(event)
        }

    }

    private fun CardEventBinding.setAttachment(event: Event) {
        val attachmentType = event.attachment.type


        imageEventImage.visibility = when (attachmentType) {
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