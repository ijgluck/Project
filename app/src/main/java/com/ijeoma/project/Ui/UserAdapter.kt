package com.ijeoma.project.Ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ijeoma.project.Model.User
import com.ijeoma.project.databinding.UserlistBinding

class UserAdapter (var users: List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(private val binding: UserlistBinding): RecyclerView.ViewHolder(binding.root){
        fun bindUser(user:User){
            binding.apply{
                Name.text = user.name
                Email.text =user.email
                Address.text = user.address.street
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserlistBinding.inflate(LayoutInflater.from(parent.context))
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.bindUser(user)
    }

    override fun getItemCount(): Int {
        return users.size
    }
}



