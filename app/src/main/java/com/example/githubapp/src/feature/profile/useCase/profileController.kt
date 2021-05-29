package com.example.githubapp.src.feature.profile.useCase
import androidx.lifecycle.LifecycleOwner
import com.example.githubapp.src.plugin.profile.gateway.ProfileViewModel

class profileController {

    private val viewModel = ProfileViewModel()

    fun doGet(lifecycleOwner: LifecycleOwner){ viewModel.registerObserver(lifecycleOwner)}


}