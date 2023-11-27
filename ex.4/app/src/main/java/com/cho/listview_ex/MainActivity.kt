package com.cho.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
//        list_item.add("A");
//        list_item.add("B");
//        list_item.add("C");
        val list_item = mutableListOf<ListviewModel>()
        list_item.add(ListviewModel("a","b"));
        list_item.add(ListviewModel("c","d"));
        list_item.add(ListviewModel("e","f"));

        val listview =findViewById<ListView>(R.id.mainListview)


        val listAdapter =ListViewAdapter(list_item)
        listview.adapter = listAdapter
    }


    private var Duble_exit=false // 앱 뒤로가기 2번 눌러서 앱 종료하는 로직 구현
    override fun onBackPressed() {
        if(Duble_exit== true){
        finish();// 앱 종료
        }

        Duble_exit=true;
        Toast.makeText(this,"엡을 종료하실려면 한번더 뒤로가기를 누르세요",Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable {
            Duble_exit=false },2000) //2초 지나면 다시 false 로 바꿔주는 로직
    }


}