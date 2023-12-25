package com.kokov.workavista.presentation.event


import androidx.recyclerview.widget.DiffUtil
import com.kokov.workavista.domain.models.Event

class EventDiffCallback : DiffUtil.ItemCallback<Event>() {
    override fun areItemsTheSame(oldItem: Event, newItem: Event) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Event, newItem: Event) = oldItem == newItem

}