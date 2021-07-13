package com.ijeoma.project.Ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ijeoma.project.Model.User
import com.ijeoma.project.databinding.UserlistBinding

class UserAdapter (val Users: List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(private val binding: UserlistBinding): RecyclerView.ViewHolder(binding.root){
        fun bindUser(user:User){
            binding.apply{
                Name.text = user.name
                Email.text =user.email
                Address.text = user.address
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}



