package com.example.githubapp.src.plugin.framework.services

import com.example.githubapp.src.feature.profile.domain.Profile
import retrofit2.Call
import retrofit2.http.GET

interface GithubAPI {

    @GET("repos")
    fun getRepo(): Call<List<Profile>>

}