package com.example.lab01

import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.lab01.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity(){
    lateinit var binding: ActivityJoinBinding
    var hobbyView:String=""
    var sexView:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_join)
        binding = ActivityJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val checkList:Array<CheckBox> = arrayOf(binding.hobby1, binding.hobby2, binding.hobby3)

        for( cbox:CheckBox in checkList) {
            cbox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { btn, b ->
                if (b) {
                    if (hobbyView.equals(""))
                        hobbyView += if (hobbyView.equals("")) {
                            cbox.text
                        } else {
                            ",${cbox.text}"
                        }
                } else {
                    var hobbyViewList = hobbyView.split(",")
                    hobbyView = hobbyViewList.subList(0, hobbyViewList.size - 2).joinToString(",")
                }

            })
        }
        binding.imgBtn.setOnClickListener {
            binding.profileView.setImageResource(R.drawable.ic_launcher_background)
        }

        binding.editSex.setOnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.xy-> sexView="남자"
                R.id.xx-> sexView="여자"

            }
        }
        binding.submitBtn.setOnClickListener {
            var result=""

            result+= " 아이디 : ${binding.editId.text}"
            result+= " 비밀번호 : ${binding.editPassword.text}"
            result+= " 자기소개 : ${binding.editIntro.text}"
            result+= " 성별 : ${sexView}"
            result+= " 취미 : ${hobbyView}"

            binding.resultView2.setText(result)
        }

        binding.resetBtn.setOnClickListener {
            binding.editId.setText("")
            binding.editPassword.setText("")
            binding.editIntro.setText("")

            when(binding.editSex.checkedRadioButtonId){
                R.id.xy-> binding.xy.isChecked=false
                R.id.xx-> binding.xx.isChecked=false
            }
        }
    }
}