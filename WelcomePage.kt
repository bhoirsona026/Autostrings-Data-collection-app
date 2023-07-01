package com.example.autostrings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomepage)

        val nextbtn = this.findViewById<Button>(R.id.nextbtn);

        nextbtn.setOnClickListener {
            var intent = Intent(this, RegistrationForm::class.java)
            startActivity(intent)
        }

    }
}