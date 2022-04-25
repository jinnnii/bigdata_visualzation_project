package com.example.lab05

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ){
            isGranted->
            if(isGranted){
                Log.d("kej","callback..............granted..........")
            }else{
                Log.d("kej","callback..............denied..........")
            }
        }
        var status = ContextCompat.checkSelfPermission(this,
        "android.permission.ACCESS_FINE_LOCATION")
        if(status==PackageManager.PERMISSION_GRANTED){
            Log.d("kej","callback..............granted!!!!!")
        }else{
//            Log.d("kej","callback..............denied!!!!!!")
            requestLauncher.launch("android.permission.ACCESS_FINE_LOCATION")
        }

    }


}