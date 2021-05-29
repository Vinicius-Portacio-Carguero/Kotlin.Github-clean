package com.example.githubapp.src.plugin.profile

import androidx.lifecycle.MutableLiveData
import com.example.githubapp.src.feature.profile.domain.Profile
import com.example.githubapp.src.plugin.framework.services.ServiceConsumer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfileRepositoryImpl {

    companion object { val self: ProfileRepositoryImpl = ProfileRepositoryImpl() }


    var fetchObserver = MutableLiveData<Profile>()

          fun doFetch() {
             ServiceConsumer.consume().getRepo()
                .enqueue(object: Callback<Profile> {
                override fun onFailure(call: Call<Profile>, t: Throwable) {

                }

                override fun onResponse(call: Call<Profile>, response: Response<Profile>) {

                    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
                    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
                    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")

                    println(response.body())

                    fetchObserver.value = Profile(
                        response.body()?.id,
                        response.body()?.name,
                        response.body()?.fullName
                        )

                }

            })

         }

}
