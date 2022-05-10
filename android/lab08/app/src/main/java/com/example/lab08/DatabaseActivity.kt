package com.example.lab08

import android.content.ContentValues
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab08.databinding.ActivityDatabaseBinding

class DatabaseActivity : AppCompatActivity() {
    val table_name="USER_TB"
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityDatabaseBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db=openOrCreateDatabase("testdb", Context.MODE_PRIVATE, null)
        val sql="create table $table_name(" +
                "_id integer primary key autoincrement, " +
                "name text not null, " +
                "phone text)"
        try{
            db.execSQL(sql)
        }catch (e:Exception){
            e.printStackTrace()
        }

        binding.insertBtn.setOnClickListener{
            //val sql = "insert into $table_name(name,phone) values(?,?)"
            val name=binding.edName.text.toString()
            val phone = binding.edPhone.text.toString()
            //db.execSQL(sql, arrayOf(name,phone))
            val values = ContentValues()
            values.put("name",name)
            values.put("phone",phone)
            db.insert(table_name, null, values)
            binding.edName.setText("")
            binding.edPhone.setText("")
        }

        binding.queryBtn.setOnClickListener{
//            val sql="select * from $table_name"
//            val cursor = db.rawQuery(sql,null)
            val cursor = db.query(table_name, arrayOf("name","phone"),
                null,null,null,null,null)
            while (cursor.moveToNext()){
//                val id=cursor.getInt(0)
//                val name=cursor.getString(1)
//                val phone=cursor.getString(2)
                val name=cursor.getString(0)
                val phone=cursor.getString(1)
//                binding.tvText.append("id:${id} \t name:${name} \t phone:${phone}")
                binding.tvText.append("name:${name} phone:${phone}\n")
            }
        }

        binding.updateBtn.setOnClickListener {
            val name= binding.edName.text.toString()
            val phone = binding.edPhone.text.toString()
            val values=ContentValues()
            values.put("name",name)
            values.put("phone",phone)
            db.update(table_name,values,"_id=?", arrayOf("1"))
        }

        binding.deleteBtn.setOnClickListener {
            db.delete(table_name,"_id=?", arrayOf("1"))
        }

    }
}