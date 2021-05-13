package com.example.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubapp.src.feature.profile.view.ProfileViewInjector
import com.example.githubapp.src.plugin.profile.gateway.DaggerProfileInjectorComponent


class MainActivity : AppCompatActivity() {

    val ProfileInjector = ProfileViewInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ProfileInjector.Fetch()

    }

}