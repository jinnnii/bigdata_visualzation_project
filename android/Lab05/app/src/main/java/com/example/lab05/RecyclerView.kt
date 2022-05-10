package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab05.databinding.ActivityRecyclerViewBinding
import com.example.lab05.databinding.ItemBinding

class RecyclerView : AppCompatActivity() {
    lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrName= arrayOf("가나다", "라마바","사아자","차카파","하가나","다라마","바사아","자차카","타파하")
        val arrPhone= arrayOf("010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555","010-6666-6666","010-7777-7777","010-8888-8888","010-9999-9999")

        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        binding.recyclerView.adapter=MyAdapter(arrName,arrPhone)
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL)
        )
    }
}

class MyViewHolder(val binding:ItemBinding): RecyclerView.ViewHolder(binding.root)
class MyAdapter(val arrName:Array<String>, val arrPhone:Array<String>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyViewHolder).binding
        binding.tvUsername.text=arrName[position]
        binding.tvPhone.text=arrPhone[position]
    }
    override fun getItemCount(): Int {
        return arrName.size
    }


}