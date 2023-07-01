package com.example.autostrings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuccessfullyRegistered : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successfully_registered)

        val obtainedname:String

        val welcomeTextView = this.findViewById<TextView>(R.id.tv)

        obtainedname = intent.getStringExtra("Refername").toString()


        welcomeTextView.text = "Hello "  +obtainedname


    }
}