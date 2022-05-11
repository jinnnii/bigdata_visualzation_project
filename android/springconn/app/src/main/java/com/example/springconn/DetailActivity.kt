package com.example.springconn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.springconn.databinding.ActivityDetailBinding
import com.example.springconn.model.UserModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val id = intent.getLongExtra("id",0)


        val networkService = (applicationContext as MyApplication).networkService
        val userModelCall=networkService.doGetUser(id)
        userModelCall.enqueue(object:Callback<UserModel>{
            override fun onResponse(call: Call<UserModel>, response: Response<UserModel>) {
                val userModel=response.body()
                binding.tvUser.text= "${userModel?.id}, ${userModel?.username}, ${userModel?.roles}"
            }

            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}