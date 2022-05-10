package com.example.lab08.retro

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab08.databinding.ItemRetrofitBinding
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewHolder(val binding:ItemRetrofitBinding):RecyclerView.ViewHolder(binding.root)


class MyAdapter(val context:Context, val datas:List<UserModel>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    = MyViewHolder(ItemRetrofitBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyViewHolder).binding
        val user=datas?.get(position)
        binding.tvId.text=user?.id
        binding.tvFirstName.text=user?.firstName
        binding.tvLastName.text=user?.secondName

        user?.avatar?.let{
            val avatarImageCall=(context.applicationContext as MyApplication).networkService
                .getAvatarImage(it)
            avatarImageCall.enqueue(object : Callback<ResponseBody>{
                override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    //요청 결과 정상
                    if(response.isSuccessful){
                        if(response.body()!=null){
                            //결과가 있는 경우
                            val bitmap=BitmapFactory.decodeStream(response.body()!!.byteStream())
                            binding.profile.setImageBitmap(bitmap)
                        }
                    }
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    //요청 결과 실패
                    call.cancel()
                }

            })
        }
    }

    override fun getItemCount(): Int {
        return datas?.size ?:0
    }

}