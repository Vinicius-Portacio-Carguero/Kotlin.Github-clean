package com.example.githubapp.src.plugin.framework.services.retrofit

import retrofit2.Retrofit

class RetrofitConnection(){

    companion object {

        val BASE_URL = "https://api.github.com/users/ViniciusPortacio/"

        fun getRetrofitConn(): Retrofit{

            return RetrofitConfig.retrofitService(BASE_URL)

        }

    }

}