package com.example.lab01

import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.lab01.databinding.ActivityBookBinding

class BookActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookBinding

    var selectYear:Int=0
    var selectMonth:Int=0
    var selectDay:Int=0
    var selectHour:Int=0
    var selectMinute:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.selectRadio.setOnCheckedChangeListener{radioGroup,i->
            when(i){
                R.id.calRadio-> {
                    binding.calendarView.isVisible = true
                    binding.timePicker.isVisible = false
                }
                R.id.timeRadio-> {
                    binding.calendarView.isVisible = false
                    binding.timePicker.isVisible = true
                }
            }
        }

        binding.startBtn.setOnClickListener{
            binding.startBtn.isEnabled=false
            binding.endBtn.isEnabled=true
            binding.chronometer.base=SystemClock.elapsedRealtime()
            binding.chronometer.start()
            binding.chronometer.setTextColor(Color.RED)
        }

        binding.calendarView.setOnDateChangeListener{
            view, year, month, dateOfMonth->
                selectYear=year
                selectMonth=month+1
                selectDay=dateOfMonth
        }
        binding.timePicker.setOnTimeChangedListener{
            timePicker, hour, minute->
            selectHour=hour
            selectMinute=minute
        }
        
        binding.endBtn.setOnClickListener{
            binding.startBtn.isEnabled=true
            binding.endBtn.isEnabled=false
            binding.chronometer.stop()
            binding.resultView.setText("${selectYear}년 ${selectMonth}월 ${selectDay}일 ${selectHour}시 ${selectMinute}분")
            binding.chronometer.setTextColor(Color.BLUE)
        }
    }
}