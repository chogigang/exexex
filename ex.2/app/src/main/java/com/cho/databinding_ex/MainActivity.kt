package com.cho.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.cho.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //임포트 필수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);

        //1번 방식 - findViewById 를 이용한 방식
//        val btn =   findViewById<Button>(R.id.testBtnId);
//        btn.setOnClickListener {
//            Toast.makeText(this,"click",Toast.LENGTH_LONG).show();
//        }



        // 2번 방식 -Databinding
    binding.testBtnId.setOnClickListener {
        Toast.makeText(this,"click",Toast.LENGTH_LONG).show(); // 위 설정보다 코드가 많이 줄었다.
    }

    }
}

/*
val = 상수
var = 일반 변수

Log.e    오류
Log.w    경고
Log.i    정보
Log.v    상세
Log.d ("MainActivity",변수 혹은 넣고싶은 메시지? )    임포트는 필수 이며 특정로그에서 디버그 값을 보고싶을때 사용


*/