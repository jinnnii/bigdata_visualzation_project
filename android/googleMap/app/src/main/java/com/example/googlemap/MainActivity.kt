package com.example.googlemap

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.googlemap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var manager:LocationManager
    lateinit var binding:ActivityMainBinding


    @SuppressLint("MissingPermission")
    fun getLocation(){
        val location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        location?.let {
            val latitude = location.latitude
            val longitude = location.longitude
            val accuracy = location.accuracy
            val time = location.time

            binding.tvText.text="$latitude, $longitude, $accuracy, $time"
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        manager=getSystemService(LOCATION_SERVICE) as LocationManager
        val permissionLauncher=registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ){
            if(it){
                getLocation()
            }else{
                binding.tvText.text="deny..."
            }
        }
        if(ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION")
            ==PackageManager.PERMISSION_GRANTED){
            getLocation()
        }else{
            permissionLauncher.launch("android.permission.ACCESS_FINE_LOCATION")
        }
    }
}