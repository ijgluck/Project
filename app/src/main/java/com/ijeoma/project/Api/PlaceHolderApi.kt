package com.ijeoma.project.Api

import com.ijeoma.project.Model.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderApi {
    @GET("users")
    suspend fun getUsers(): Call<List<User>>
}