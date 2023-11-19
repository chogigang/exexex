package com.cho.ronaldolecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)
    val getdata = intent.getStringExtra("data"); //intent 에 선언했던 데이터를 받아오는 명령
//                Toast.makeText(this,getdata,Toast.LENGTH_LONG).show() //메시지 띄우기

       val ronaldo_Image = findViewById<ImageView>(R.id.ronaldo1);

        if(getdata=="br"){
        ronaldo_Image.setImageResource(R.drawable.ronaldo_);

        }
        if(getdata=="cute"){
        ronaldo_Image.setImageResource(R.drawable.ronaldo_cute);

    }
        if(getdata=="jube"){
        ronaldo_Image.setImageResource(R.drawable.ronaldo_jube);
    }
        if(getdata=="real"){
            ronaldo_Image.setImageResource(R.drawable.ronaldo_real);
        }
        if(getdata=="water"){
            ronaldo_Image.setImageResource(R.drawable.ronaldo_water);
        }
        if(getdata=="saudi"){
            ronaldo_Image.setImageResource(R.drawable.ronaldo_saudi);
        }
    }
}