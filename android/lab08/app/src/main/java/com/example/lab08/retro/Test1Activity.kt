package com.example.lab08.retro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab08.R
import com.example.lab08.databinding.ActivityTest1Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Test1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTest1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val networkService= (applicationContext as MyApplication).networkService
        val userListCall = networkService.doGetUserList("2")

//        userListCall.enqueue(object :Callback<UserListModel>{
//            override fun onResponse(call: Call<UserListModel>, response: Response<UserListModel>) {
//                val userList = response.body()
//                binding.recyclerView2.adapter=MyAdapter(this@Test1Activity, userList?.data)
////                binding.recyclerView2.layoutManager=LinearLayoutManager(this)
//                binding.recyclerView2.addItemDecoration(
//                    DividerItemDecoration(this@Test1Activity, LinearLayoutManager.VERTICAL))
//            }
//
//            override fun onFailure(call: Call<UserListModel>, t: Throwable) {
//                call.cancel()
//            }
//        })
    }
}
