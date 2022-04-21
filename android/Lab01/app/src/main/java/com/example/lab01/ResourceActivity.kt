package com.example.lab01

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityResourceBinding

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_resource)

        var binding=ActivityResourceBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            var img =  getDrawable(R.drawable.video)
            binding.imageView.setImageDrawable(img)
        }

        binding.button2.setOnClickListener {
            var str = getString(R.string.app_name)
            binding.textView.setText(str)
        }

        var radios:Array<RadioButton> = arrayOf(binding.radioButton, binding.radioButton2, binding.radioButton3)
        var images: Array<Drawable?> = arrayOf(getDrawable(R.drawable.add), getDrawable(R.drawable.back), getDrawable(R.drawable.call))
        var imageView = binding.imageView
        for (i in 0..images.size-1){
            radios[i].setOnClickListener{
                imageView.setImageDrawable(images[i])
            }
        }

        binding.button3.setOnClickListener {
            when(binding.radioGroup.checkedRadioButtonId){
                R.id.radioButton->{
//                    binding.imageView.setImageDrawable(images[0])
                    binding.imageView.setImageResource(R.drawable.call)
                }
                R.id.radioButton2->{
                    binding.imageView.setImageResource(R.drawable.back)
                }
                R.id.radioButton3->{
                    binding.imageView.setImageResource(R.drawable.add)
                }
            }
        }
    }
}