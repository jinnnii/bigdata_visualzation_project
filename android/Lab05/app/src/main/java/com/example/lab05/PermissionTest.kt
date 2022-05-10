package com.example.lab05

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.lab05.databinding.ActivityPermissionTestBinding
import com.example.lab05.databinding.InputDialogBinding

class PermissionTest : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding =ActivityPermissionTestBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.toastBtn.setOnClickListener{
            var toast = Toast.makeText(this,"toast Message", Toast.LENGTH_SHORT)
            toast.addCallback(
                object:Toast.Callback(){
                    override fun onToastHidden() {
                        super.onToastHidden()
                    }

                    override fun onToastShown() {
                        super.onToastShown()
                        Log.d("kej","toast show!!")
                    }
                }
            )
            toast.show()
        }

        binding.datePickBtn.setOnClickListener{
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { 
                    datePick, year, month, day ->
                Log.d("kej", "Date:${year}년 ${month+1}월 ${day}일")
            },2022,10,31).show()
        }


        binding.timePickBtn.setOnClickListener{
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener{
                timePicker, i, i2 ->
                Log.d("kej", "${i}시 ${i2}분")
                binding.textView.text="time: ${i}시 ${i2}분"
            }, 16,20,true).show()
        }

        binding.alertBtn.setOnClickListener{
            AlertDialog.Builder(this).run{
                setTitle("Test Dialog")
                setIcon(android.R.drawable.ic_delete)
                setMessage("정말로 종료하겠습니까?")
                setPositiveButton("OK",null)
                setNegativeButton("CANCEL", null)
                setNeutralButton("MORE", null)

                setPositiveButton("YES", DialogInterface.OnClickListener {
                        dialogInterface, i ->
                    binding.textView.text = "YES 버튼클 릭"
                })
                setNegativeButton("NO", null)
                show()
            }
        }

        binding.alertItemBtn.setOnClickListener{
            val items= arrayOf<String>("🍔","🍕","🍟","🌭", "🥨")
            var str=""
            AlertDialog.Builder(this).run{
                setTitle("Item Dialog")
                setIcon(android.R.drawable.ic_dialog_alert)
                setMultiChoiceItems(items,
                    booleanArrayOf(true, false, false, false,false),
                    DialogInterface.OnMultiChoiceClickListener {
                            dialogInterface, i, b ->
                        if (b){
                            str+=items[i]
                        }else{
                            str=str.replace(items[i],"")
                        }
                    }
                )
                setPositiveButton("OK",null)
                setNegativeButton("CANCEL", null)
                setNeutralButton("MORE", null)

                show()
            }
        }


        binding.alertBtn.setOnClickListener {
            var dialogBinding = InputDialogBinding.inflate(layoutInflater)
            AlertDialog.Builder(this).run{
                setTitle("Item Dialog")
                setIcon(android.R.drawable.ic_dialog_alert)

                setPositiveButton("OK", DialogInterface.OnClickListener{
                    dialogInterface, i ->
                    var str=dialogBinding.editText.text.toString()
                    var id=dialogBinding.radioGroup.checkedRadioButtonId
                    when(id){
                        R.id.radioMale -> str+=dialogBinding.radioMale.text.toString()
                        R.id.radioFemale->str+=dialogBinding.radioFemale.text.toString()
                    }
                    binding.textView.text= str
                })
                setNegativeButton("CANCEL", null)
                setNeutralButton("MORE", null)

                show()
            }
        }
    }

}

