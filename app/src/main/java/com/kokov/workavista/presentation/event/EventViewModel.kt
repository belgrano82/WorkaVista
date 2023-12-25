package com.kokov.workavista.presentation.event

import EventRepositoryImpl
import androidx.lifecycle.ViewModel
import com.kokov.workavista.domain.repositories.EventRepository

class EventViewModel: ViewModel() {

    private val repository: EventRepository = EventRepositoryImpl()
    val data = repository.getAllEvents()
}