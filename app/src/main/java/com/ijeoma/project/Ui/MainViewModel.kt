package com.ijeoma.project.Ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ijeoma.project.Api.RetrofitProvider
import com.ijeoma.project.Model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    val postsLiveData = MutableLiveData<List<User>>()
    fun getUsers(){
        RetrofitProvider.placeHolderApi.getUsers().enqueue(object : Callback<List<User>>{
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                TODO("Not yet implemented")
            }
        }


    })
}