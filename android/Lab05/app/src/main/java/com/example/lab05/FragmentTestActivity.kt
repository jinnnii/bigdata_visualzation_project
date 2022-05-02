package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lab05.databinding.ActivityFragmentTestBinding

class FragmentTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFragmentTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager3.adapter=MyFragmentAdapter(this)
    }
}

class MyFragmentAdapter(activity:FragmentTestActivity):FragmentStateAdapter(activity){
    val fragments:List<Fragment>
    init{
        fragments = listOf(Test1Fragment(), Test2Fragment(), Test3Fragment())
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}