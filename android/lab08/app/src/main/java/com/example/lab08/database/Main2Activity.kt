package com.example.lab08.database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab08.R
import com.example.lab08.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    lateinit var adapter:MyAdapter
    var datas:MutableList<String>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //이동 액티비티에서 받는 값
        val requestLauncher= registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){
            it.data!!.getStringExtra("result")?.let{
                //값이 있으면
                datas?.add(it)
                adapter.notifyDataSetChanged()
            }
        }
        binding.mainFab.setOnClickListener {
            val intent= Intent(this, AddActivity::class.java)
            requestLauncher.launch(intent)
        }
        datas= mutableListOf<String>()
        val db=MyDBHelper(this).readableDatabase
        val cursor = db.rawQuery("select * from TODO_TB",null)
        cursor.run{
            while (moveToNext()){
                datas?.add(cursor.getString(1))
            }
        }
        db.close()

        val layoutManager=LinearLayoutManager(this)
        binding.mainRecyclerView.layoutManager=layoutManager
        adapter= MyAdapter(datas)
        binding.mainRecyclerView.adapter=adapter
        binding.mainRecyclerView.addItemDecoration(
            DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.menu_main_setting){
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}