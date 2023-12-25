package com.kokov.workavista.presentation.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kokov.workavista.databinding.FragmentsUsersBinding

class UserFragment: Fragment() {

    private val viewModel: UserViewModel by viewModels()
    private val adapter = UserAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentsUsersBinding.inflate(inflater, container, false)


        binding.usersList.adapter = adapter
        viewModel.data.observe(viewLifecycleOwner) { users ->
            adapter.submitList(users)
        }
        return binding.root
    }
}