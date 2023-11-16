package com.cho.ronaldolecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION") // 권장되지 않는 어노테이과 관된 경를 억제    DEPRECATION:권장되지 않는 기능과 관련된 경고를 억제
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({ //메인 Activity로 넘겨주기 위한 작업
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        },3000)// 3초 뒤에 mainActivity로 넘겨준다는 뜻이다.
    }
}

