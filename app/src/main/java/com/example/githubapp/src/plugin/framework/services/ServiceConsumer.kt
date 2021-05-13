package com.example.githubapp.src.plugin.framework.services

import com.example.githubapp.src.plugin.framework.services.retrofit.RetrofitSetup

class ServiceConsumer() {

    companion object serviceConsumer {

        fun consume() : GithubAPI {

            val PluginSetup = RetrofitSetup

            return PluginSetup.service().create(GithubAPI::class.java)

        }

    }

}