package com.example.githubapp.src.feature.profile.view

import com.example.githubapp.src.plugin.profile.gateway.DaggerProfileInjectorComponent

class ProfileViewInjector {

    companion object {

        fun Fetch() {

            return DaggerProfileInjectorComponent
                        .builder()
                        .build()
                        .Fetch()
                        .doFetch()
        }
    }
}