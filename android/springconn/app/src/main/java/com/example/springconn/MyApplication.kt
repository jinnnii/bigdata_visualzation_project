package com.example.springconn

import android.app.Application
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyApplication:Application() {
    var networkService:INetworkService
    val retrofit: Retrofit
    get()=Retrofit.Builder()
        .baseUrl("http://10.100.103.26:8081/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    init {
        networkService=retrofit.create(INetworkService::class.java)
    }
}