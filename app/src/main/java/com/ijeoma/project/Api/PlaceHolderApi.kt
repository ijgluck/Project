package com.ijeoma.project.Api

import com.ijeoma.project.Model.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderApi {
    @GET("users")
    fun getUsers(): Call<List<User>>
}