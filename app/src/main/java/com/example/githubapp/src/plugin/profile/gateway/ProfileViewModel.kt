package com.example.githubapp.src.plugin.profile.gateway

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.githubapp.src.feature.profile.business.ProfileRepository
import com.example.githubapp.src.feature.profile.domain.Profile
import com.example.githubapp.src.plugin.profile.ProfileRepositoryImpl

class ProfileViewModel: ProfileRepository {

    private lateinit var repositoryImpl: ProfileRepositoryImpl

    fun registerObserver(lifeCycle: LifecycleOwner){
        repositoryImpl.fetchObserver.observe(lifeCycle, fetchObserver)



    }

    private val fetchObserver = Observer<Profile> { profile ->
        profile?.let {

            println(profile.fullName)
        }

    }


    override fun doFetch(lifeCycle: LifecycleOwner) {

        registerObserver(lifeCycle)
    }

}