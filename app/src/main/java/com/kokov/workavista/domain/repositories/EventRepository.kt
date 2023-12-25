package com.kokov.workavista.domain.repositories

import androidx.lifecycle.LiveData
import com.kokov.workavista.domain.models.Event

interface EventRepository {
    fun getAllEvents(): LiveData<List<Event>>
}