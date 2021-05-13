package com.example.githubapp.src.plugin.profile.gateway

import dagger.Component
import javax.inject.Singleton

@Singleton @Component()
interface ProfileInjectorComponent { fun Fetch(): ProfileViewModel }
