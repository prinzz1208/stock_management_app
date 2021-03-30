package com.example.stockmanagement.presentation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.asLiveData
import androidx.navigation.fragment.findNavController
import com.example.stockmanagement.R
import com.example.stockmanagement.data.models.datastore.UserPreferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    @Inject lateinit var up: UserPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

    }

    private fun init() {
        up.userIsLoggedInFlow.asLiveData().observe( viewLifecycleOwner,{
            if(!it){
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToLoginFragment())
            }
        })
    }
}