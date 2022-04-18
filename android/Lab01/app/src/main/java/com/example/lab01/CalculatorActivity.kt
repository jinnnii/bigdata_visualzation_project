package com.example.lab01

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityCalculatorBinding

class MyEventHandler(binding:ActivityCalculatorBinding):CompoundButton.OnCheckedChangeListener{
    lateinit var binding:ActivityCalculatorBinding
    init{
        this.binding= binding
    }
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
//        TODO("Not yet implemented")
        if(p1) {
            binding.resultView.setText(binding.checkBox.text)
        }else{
            binding.resultView.setText("0")
        }
    }
}


class CalculatorActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding:ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.num0.setOnClickListener(this)
        binding.num1.setOnClickListener(this)
        binding.num2.setOnClickListener(this)
        binding.num3.setOnClickListener(this)
        binding.checkBox.setOnCheckedChangeListener(MyEventHandler(binding))

//        binding.checkBox.setOnCheckedChangeListener(this)
//        setContentView(R.layout.activity_calculator)
        // 익명으로 하는 리스너, 간단하게 쓰기에는 용이
//        binding.c.setOnClickListener(View.OnClickListener {
//            binding.resultView.setText("0")
//        })
//        binding.num0.setOnClickListener(View.OnClickListener {
//            binding.resultView.setText( "${binding.resultView.text}0")
//        })
//
//        binding.checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{
//            compoundButton, b ->
//            if(b){
//                binding.resultView.setText(binding.checkBox.text)
//            }else{
//                binding.resultView.setText("0")
//            }
//        })
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN->{
                Log.d("kej","Touch down event");
            }
            MotionEvent.ACTION_UP->{
                Log.d("kej","Touch up event")
            }

            MotionEvent.ACTION_MOVE->{
                Log.d("kej","Touch Move event x: ${event.x}, ${event.y}")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KeyEvent.KEYCODE_BACK->{
                Log.d("kej","KeyBack")
            }

            KeyEvent.KEYCODE_VOLUME_UP->{
                Log.d("kej","Volume_up")
            }
            KeyEvent.KEYCODE_VOLUME_DOWN->{
                Log.d("kej","Volume_down")
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        Log.d("kej","Press back")
        super.onBackPressed()
    }

    override fun onClick(p0: View?) {
//        TODO("Not yet implemented")
        when(p0){
            binding.num0->binding.resultView.text= "0"
            binding.num1->binding.resultView.text= "1"
            binding.num2->binding.resultView.text= "2"
            binding.num3->binding.resultView.text= "3"
        }
    }

}