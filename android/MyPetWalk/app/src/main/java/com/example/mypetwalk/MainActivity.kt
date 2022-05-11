package com.example.mypetwalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.mypetwalk.databinding.ActivityMainBinding
import com.example.mypetwalk.frag.*

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var fragmentManager:FragmentManager
    lateinit var fragmentTransaction: FragmentTransaction

//    val bottomNav = binding.bottomNav
//    fun changeFragment(frag:Fragment){
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.main_frame, frag)
//            .commit()
//
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.bottomNav.run {
//            setOnItemSelectedListener { item->
//                when(item.itemId){
//                    R.id.action_community->{
//                        changeFragment(FragCommunity())
//                    }
//                    R.id.action_calendar->{
//                        changeFragment(FragCalendar())
//                    }
//                    R.id.action_home->{
//                        changeFragment(FragHome())
//                    }
//                    R.id.action_walking->{
//                        changeFragment(FragWalk())
//                    }
//                    R.id.action_my_page->{
//                        changeFragment(FragMypage())
//                    }
//
//
//                }
//                true
//            }
//            selectedItemId=R.id.action_home
//        }
    }
}