package com.example.autostrings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView



class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val image= findViewById<ImageView>(R.id.imageView)
        image.alpha = 0f
        image.animate().setDuration(2000).alpha(1f).withEndAction {
            val intent = Intent (this,WelcomePage::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }

}