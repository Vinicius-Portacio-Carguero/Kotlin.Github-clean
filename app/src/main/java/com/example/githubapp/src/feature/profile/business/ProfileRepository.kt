package com.example.githubapp.src.feature.profile.business

import androidx.lifecycle.LifecycleOwner


interface ProfileRepository { fun doFetch(lifecycleOwner: LifecycleOwner) }