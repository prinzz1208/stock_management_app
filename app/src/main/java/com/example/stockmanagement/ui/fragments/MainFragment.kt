package com.example.stockmanagement.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.asLiveData
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide.init
import com.example.stockmanagement.R
import com.example.stockmanagement.models.datastore.UserPreferences
import dagger.hilt.android.AndroidEntryPoint
import dagger.internal.InjectedFieldSignature
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