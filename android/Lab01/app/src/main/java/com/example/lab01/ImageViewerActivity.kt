package com.example.lab01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityImageViewerBinding

class ImageViewerActivity : AppCompatActivity() {
    lateinit var binding:ActivityImageViewerBinding
    lateinit var ids:Array<Int>
    lateinit var titles:Array<String>
    var i:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ids= arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9)
        titles= arrayOf("독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서")

        binding= ActivityImageViewerBinding.inflate(layoutInflater)

        binding.imgTitle.text = titles[0]
        binding.imageView.setImageResource(ids[0])
        binding.prevBtn.isEnabled=false

        setContentView(binding.root)

        binding.nextBtn.setOnClickListener{
            i = changeI(i+1)
            binding.imageView.setImageResource(ids[i])
            binding.imgTitle.text = titles[i]
        }

        binding.prevBtn.setOnClickListener{
            i=changeI(i-1)
            binding.imageView.setImageResource(ids[i])
            binding.imgTitle.text = titles[i]
        }
    }


    private fun changeI(_idx:Int):Int{
        var idx = _idx
        when {
            idx<=0 -> {
                idx =0
                binding.prevBtn.isEnabled=false
            }
            idx>=ids.size-1 -> {
                idx=ids.size-1
                binding.nextBtn.isEnabled=false
            }
            else -> {
                binding.nextBtn.isEnabled=true
                binding.prevBtn.isEnabled=true
            }
        }
        return idx
    }
}