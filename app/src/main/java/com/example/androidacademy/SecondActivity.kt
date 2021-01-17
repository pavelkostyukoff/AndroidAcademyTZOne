package com.example.androidacademy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidacademy.MainActivity.Companion.TR_B
import com.example.androidacademy.MainActivity.Companion.TR_I
import com.example.androidacademy.MainActivity.Companion.TR_S

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tr_s = intent.getStringExtra(TR_S)
        val tr_i = intent.getIntExtra(TR_I, -1)
        val tr_b = intent.getBooleanExtra(TR_B, false)
        val testier: TextView = findViewById(R.id.second_activity_text_view)
        testier.text = tr_s
    }
}