package com.example.lab08.database

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab08.databinding.ItemRecyclerviewBinding

class MyViewHolder(val binding: ItemRecyclerviewBinding):RecyclerView.ViewHolder(binding.root)
class MyAdapter(val datas:MutableList<String>?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = MyViewHolder(
        ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //실제로 리사이클러 뷰에 들어가는 내용 바인딩
        val binding = (holder as MyViewHolder).binding
        binding.itemData.text=datas!![position]
    }

    override fun getItemCount(): Int {
        return datas?.size ?:0
    }

}