package com.kokov.workavista.presentation.event

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kokov.workavista.databinding.FragmentEventsBinding

class EventFragment: Fragment() {

    private val viewModel: EventViewModel by viewModels()
    private val adapter = EventAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEventsBinding.inflate(inflater, container, false)


        binding.eventsList.adapter = adapter
        viewModel.data.observe(viewLifecycleOwner) { events ->
            adapter.submitList(events)
        }

        return binding.root
    }
}