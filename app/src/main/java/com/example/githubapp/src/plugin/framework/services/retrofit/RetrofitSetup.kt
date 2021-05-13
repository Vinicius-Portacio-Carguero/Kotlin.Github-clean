package com.example.githubapp.src.plugin.framework.services.retrofit

import com.example.githubapp.src.plugin.framework.services.retrofit.RetrofitConnection.Companion.getRetrofitConn
import retrofit2.Retrofit


class RetrofitSetup() { companion object setup { fun service(): Retrofit { return getRetrofitConn() } } }
