package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lab06.databinding.ActivityTest3Binding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Test3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter1 = MyTabPagerAdapter(this)
        binding.viewPager.adapter=adapter1

        TabLayoutMediator(binding.tabs, binding.viewPager){
            tab,position->
            tab.text="Tab${(position+1)}"
        }.attach()


//        supportFragmentManager.beginTransaction().add(R.id.tabContent, Test1Fragment()).commit()

//        binding.tabs.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                val transaction = supportFragmentManager.beginTransaction()
//                when(tab?.text){
//                    "Tab1"->transaction.replace(R.id.tabContent, Test1Fragment())
//                    "Tab2"->transaction.replace(R.id.tabContent, Test2Fragment())
//                    "Tab3"->transaction.replace(R.id.tabContent, Test3Fragment())
//                }
//                transaction.addToBackStack(null)
//                transaction.commit()
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//
//            }
//
//        })

    }
}

class MyTabPagerAdapter(activity:FragmentActivity):FragmentStateAdapter(activity){
    val fragments:List<Fragment>
    init {
        fragments= listOf(Test1Fragment(), Test2Fragment(), Test3Fragment())
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}


