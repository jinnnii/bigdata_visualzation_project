package com.example.lab01

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityCalculatorBinding
import java.util.*

//class MyEventHandler(binding:ActivityCalculatorBinding):CompoundButton.OnCheckedChangeListener{
//    lateinit var binding:ActivityCalculatorBinding
//    init{
//        this.binding= binding
//    }
//    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
////        TODO("Not yet implemented")
//        if(p1) {
//            binding.resultView.setText(binding.checkBox.text)
//        }else{
//            binding.resultView.setText("0")
//        }
//    }
//}


class CalculatorActivity : AppCompatActivity() {
    lateinit var binding:ActivityCalculatorBinding
    lateinit var btnArray:Array<Button>
    var resultStr =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnArray= arrayOf(binding.num0, binding.num1, binding.num2, binding.num3, binding.num4, binding.num5, binding.num6, binding.num7,binding.num8, binding.num9
        ,binding.c, binding.mul, binding.div, binding.dot, binding.per, binding.plus, binding.sub, binding.result)

        for (btn in btnArray){

            btn.setOnClickListener {
                var result = 0.0

                var str = btn.text
                when (str) {
                    "=" -> {
                        var tokStr = StringTokenizer(resultStr, "+-*/", true)
                        var num1 = tokStr.nextToken().toDouble()
                        var op = tokStr.nextToken()
                        var num2 = tokStr.nextToken().toDouble()

                        when (op) {
                            "+" -> result = num1 + num2
                            "-" -> result = num1 - num2
                            "*" -> result = num1 * num2
                            "/" -> result = num1 / num2
                        }

                        binding.resultView.setText(result.toString())
                        resultStr = result.toString()
                    }
                    "C" -> {
                        resultStr = ""
                        binding.resultView.setText("0.0")
                    }
                    else -> {
                        resultStr += str
                        binding.resultView.setText(resultStr)
                    }
                }
            }

//            btn.setOnClickListener(this)
        }

//        binding.checkBox.setOnCheckedChangeListener(MyEventHandler(binding))

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

//    override fun onClick(p0: View?) {
////        TODO("Not yet implemented")
////        when(p0){
////            binding.num0->binding.resultView.text= "0"
////            binding.num1->binding.resultView.text= "1"
////            binding.num2->binding.resultView.text= "2"
////            binding.num3->binding.resultView.text= "3"
////        }
//
//    }


//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        when(event?.action){
//            MotionEvent.ACTION_DOWN->{
//                Log.d("kej","Touch down event");
//            }
//            MotionEvent.ACTION_UP->{
//                Log.d("kej","Touch up event")
//            }
//
//            MotionEvent.ACTION_MOVE->{
//                Log.d("kej","Touch Move event x: ${event.x}, ${event.y}")
//            }
//        }
//        return super.onTouchEvent(event)
//    }

//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        when(keyCode){
//            KeyEvent.KEYCODE_BACK->{
//                Log.d("kej","KeyBack")
//            }
//
//            KeyEvent.KEYCODE_VOLUME_UP->{
//                Log.d("kej","Volume_up")
//            }
//            KeyEvent.KEYCODE_VOLUME_DOWN->{
//                Log.d("kej","Volume_down")
//            }
//        }
//        return super.onKeyDown(keyCode, event)
//    }
//
//    override fun onBackPressed() {
//        Log.d("kej","Press back")
//        super.onBackPressed()
//    }

}