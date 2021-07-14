package com.ijeoma.project.Ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ijeoma.project.Api.RetrofitProvider
import com.ijeoma.project.Model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    val usersLiveData = MutableLiveData<List<User>>()
   fun getUsers(){
       CoroutineScope(Dispatchers.IO).launch {
        usersLiveData.postValue(RetrofitProvider.placeHolderApi.getUsers())
       }
   }
}