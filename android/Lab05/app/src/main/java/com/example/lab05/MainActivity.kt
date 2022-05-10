package com.example.lab05

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowMetrics
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.lab05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

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
