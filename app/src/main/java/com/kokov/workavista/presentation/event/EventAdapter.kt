package com.kokov.workavista.presentation.event

import EventRepositoryImpl
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.kokov.workavista.databinding.CardEventBinding
import com.kokov.workavista.domain.models.Event

class EventAdapter() : ListAdapter<Event, EventViewHolder>(EventDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val binding = CardEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = getItem(position)
        holder.bind(event)
    }

    override fun getItemCount(): Int = EventRepositoryImpl().events.size

}