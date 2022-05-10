package com.example.lab05

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.lab05.databinding.ActivityMovieViewBinding
import com.example.lab05.databinding.MovieItemBinding

class MovieView : AppCompatActivity() {
    lateinit var binding:ActivityMovieViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMovieViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrTitle= arrayOf("써니","완득이","괴물","라디오스타","비열한거리","왕의남자","아일랜드","웰컴투동막골","헬보이","백투더퓨쳐")
        val arrPoster= arrayOf(R.drawable.mov01, R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10)
        val arrPointer = arrayOf(4.5,5.0,4.2,3.8,4.0,4.9,2.2,5.0,4.8,4.6)

//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val layoutManager = GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false)
//        val layoutManager = GridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.movieView.layoutManager=layoutManager
        binding.movieView.adapter=MovieAdapter(arrTitle, arrPoster, arrPointer)
        binding.movieView.addItemDecoration(
            DividerItemDecoration(this,
            LinearLayoutManager.VERTICAL)
        )
    }
}
class MovieHolder(val binding:MovieItemBinding):RecyclerView.ViewHolder(binding.root)
class MovieAdapter(val arrTitle:Array<String>, val arrPoster:Array<Int>, val arrPointer:Array<Double>):
        RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieHolder(MovieItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MovieHolder).binding
        binding.tvTitle.text=arrTitle[position]
        binding.tvPoint.text=arrPointer[position].toString()
        binding.tvPoster.setImageResource(arrPoster[position])
    }

    override fun getItemCount(): Int {
        return arrPoster.size
    }

}


class MyDecoration(val context: Context):RecyclerView.ItemDecoration(){
    override fun onDraw(c:Canvas, parent:RecyclerView, state:RecyclerView.State){
        super.onDraw(c, parent, state)
        c.drawBitmap(BitmapFactory.decodeResource(context.resources,R.drawable.stadium),0f,0f,
            Paint()
        )
    }

    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(c, parent, state)
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val index=parent.getChildAdapterPosition(view)+1
        if(index%3==0)
            outRect.set(10,10,10,60)
        else
            outRect.set(10,10,10,0)
        view.setBackgroundColor(Color.WHITE)
        ViewCompat.setElevation(view,20.0f)
    }


}