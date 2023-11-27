package com.cho.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.cho.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) { //데이터 바인딩

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    binding =DataBindingUtil.setContentView(this,R.layout.activity_main); //데이터 바인딩

      val diceImage1 =binding.dice1
      val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
          //  Toast.makeText(this,"주사위 ㄱㄱ ",Toast.LENGTH_LONG).show(); //findViewById 보다 더 짧게 칠수 있음

            Random.nextInt(1,6)//1~6까지 랜덤 숫자를 뽑음

            Log.d("MainActivity",Random.nextInt(1,6).toString())

            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            when (number1) { //첫번째 주사위의 스위치 캐이스문
                1 -> diceImage1.setImageResource(R.drawable.dice_1);
                2 -> diceImage1.setImageResource(R.drawable.dice_2);
                3 -> diceImage1.setImageResource(R.drawable.dice_3)
                4 -> diceImage1.setImageResource(R.drawable.dice_4)
                5 -> diceImage1.setImageResource(R.drawable.dice_5)
                else -> diceImage1.setImageResource(R.drawable.dice_6)
            }
            when (number2) {  //두번째 주사위의 스위치 캐이스문
                1 -> diceImage2.setImageResource(R.drawable.dice_1);
                2 -> diceImage2.setImageResource(R.drawable.dice_2);
                3 -> diceImage2.setImageResource(R.drawable.dice_3)
                4 -> diceImage2.setImageResource(R.drawable.dice_4)
                5 -> diceImage2.setImageResource(R.drawable.dice_5)
                else -> diceImage2.setImageResource(R.drawable.dice_6)
            }

            diceImage1.setImageResource(R.drawable.dice_2) //버튼을 눌렀을때 이미지를 랜덤으로 변경
        }

    }
}