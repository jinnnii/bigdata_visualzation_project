package com.example.mypetwalk.adapter

import android.content.Context
import android.media.Image
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val context: Context, var photoList:ArrayList<Image>):RecyclerView.Adapter<ImageAdapter.ViewHolder>(){
    var onItemClickListener:AdapterView.OnItemClickListener?=null
} {
}