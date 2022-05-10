package com.example.mypetwalk.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mypetwalk.R
import com.example.mypetwalk.databinding.ImageItemBinding
import com.example.mypetwalk.model.Image

class ImageViewHolder(val binding:ImageItemBinding):RecyclerView.ViewHolder(binding.root)


/**
 * Adapter : 리사이클뷰와 데이터(DB에서 가져온 이미지 데이터) 사이의 통신을 위한 일종의 다리 역할을 하는 클래스
 */
class ImageAdapter(val context: Context, var imageList:ArrayList<Image>?):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = ImageViewHolder(
        ImageItemBinding.inflate(LayoutInflater.from(parent.context),parent, false))


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as ImageViewHolder).binding
        val image = imageList?.get(position)

        /**
         * Glide
         * 서버에 저장되어있는 이미지 데이터를
         * 앱에 출력할 수 있도록 도와주는 라이브러리!
         */
        Glide.with(context).load(image?.imageUrl)
            .override(500,500)
            .placeholder(R.drawable.loading)
            .placeholder(R.drawable.error)
            .into(binding.image)
    }

    override fun getItemCount(): Int {
        return imageList?.size ?:0
    }
}



