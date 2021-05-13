package com.example.githubapp.src.plugin.profile.gateway

import com.example.githubapp.src.plugin.profile.ProfileRepositoryImpl
import javax.inject.Inject

class ProfileViewModel
@Inject constructor(){ fun doFetch() { ProfileRepositoryImpl.self.doFetch() } }