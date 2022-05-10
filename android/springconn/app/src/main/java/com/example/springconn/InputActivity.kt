package com.example.springconn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.springconn.databinding.ActivityInputBinding
import com.example.springconn.model.UserModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InputActivity : AppCompatActivity() {
    lateinit var binding:ActivityInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            var userModel = UserModel(
                id=0,
                username = binding.edId.text.toString(),
                password = binding.edPassword.text.toString(),
                roles="USER"
            )
            val networkService= (applicationContext as MyApplication).networkService
            val userInsertCall = networkService.insert(userModel)
            userInsertCall.enqueue(object :Callback<String>{
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d("kej","success!!")
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    call.cancel()
                }
            })
            finish()
        }

    }


}