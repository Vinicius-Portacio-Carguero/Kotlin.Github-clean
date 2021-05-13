package com.example.githubapp.src.plugin.profile

import com.example.githubapp.src.feature.profile.business.ProfileRepository
import com.example.githubapp.src.feature.profile.domain.Profile
import com.example.githubapp.src.plugin.framework.services.ServiceConsumer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Singleton

@Singleton class ProfileRepositoryImpl : ProfileRepository{

    companion object { var self: ProfileRepositoryImpl = ProfileRepositoryImpl() }

         override fun doFetch() {
             ServiceConsumer.consume().getRepo()
                .enqueue(object: Callback<List<Profile>> {
                override fun onFailure(call: Call<List<Profile>>, t: Throwable) {

                }

                override fun onResponse(call: Call<List<Profile>>, response: Response<List<Profile>>) {
                    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
                    println(response.body()!!)
                }

            })

         }

}
