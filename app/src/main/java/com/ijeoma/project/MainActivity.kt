package com.ijeoma.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ijeoma.project.Ui.MainViewModel
import com.ijeoma.project.Ui.UserAdapter
import com.ijeoma.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        userAdapter = UserAdapter (listOf())
        viewModel = ViewModelProvider(this)[MainViewModel ::class.java]

        binding.userRv.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager( this@MainActivity)

        }
        viewModel.run{
            getUsers()
            usersLiveData.observe(this@MainActivity,{users ->
                userAdapter.users = users
                userAdapter.notifyDataSetChanged()
            })
        }



    }
}