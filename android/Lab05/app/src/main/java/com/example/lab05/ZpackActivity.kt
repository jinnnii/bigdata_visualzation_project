package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab05.databinding.ActivityRecyclerViewBinding
import com.example.lab05.databinding.ActivityZpackBinding

class ZpackActivity : AppCompatActivity() {

    lateinit var binding:ActivityZpackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityZpackBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // 이전화면 돌아가기 <-
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    //메뉴 구성 : 액티비티가 실행되면서 처음 한번만 호출
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val menuItem1:MenuItem? = menu?.add(0,0,0,"menu1")
//        val menuItem2:MenuItem? = menu?.add(0,0,0,"menu2")
//        val menuItem =menu?.findItem(R.id.menu_search)
//        val searchView
//        menuInflater.inflate(R.menu.menu_main, menu)
//        val menuItem=menu?.findItem(R.id.menu_search)
//        val searchView = menuItem?.actionView as SearchView
//
//        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(p0: String?): Boolean {
//                //검색어 변경 이벤트
//                return true
//            }
//
//            override fun onQueryTextChange(p0: String?): Boolean {
//                //키보드 검색 버튼을 클릭한 순간에 발생하는 이벤트
//                return true
//            }
//        })

        return super.onCreateOptionsMenu(menu)

    }

//    //메뉴 구성 : 액티비티가 실행되면서 한 번 호출 된 후, 오버플로 메뉴가 나타낼때마다 반복
//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        val menuItem1:MenuItem? = menu?.add(0,0,0,"menu1")
//        val menuItem2:MenuItem? = menu?.add(0,0,0,"menu2")
//        return super.onPrepareOptionsMenu(menu)
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            0->{
                Log.d("kej","menu1 click")
                true
            }
            1->{
                Log.d("kej","menu2 click")
                true
            }
            else-> super.onOptionsItemSelected(item)
        }
    }
}
