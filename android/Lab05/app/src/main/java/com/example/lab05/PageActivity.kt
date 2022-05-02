package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab05.databinding.ActivityPageBinding
import com.example.lab05.databinding.ItemPagerBinding

class PageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=ActivityPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datas= arrayOf(R.drawable.mov01, R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10)
        binding.viewPager2.adapter=MyPagerAdapter(datas)
    }
}

class MyPagerViewHolder(val binding:ItemPagerBinding):RecyclerView.ViewHolder(binding.root)

class MyPagerAdapter(val datas:Array<Int>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):RecyclerView.ViewHolder {
        return MyPagerViewHolder(ItemPagerBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyPagerViewHolder).binding
        binding.viewpage.setImageResource(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

}