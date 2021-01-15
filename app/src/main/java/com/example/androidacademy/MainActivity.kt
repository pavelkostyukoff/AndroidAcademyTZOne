package com.example.androidacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview: TextView = findViewById(R.id.first_activity_text_view)
        textview.setOnClickListener {
            moveTOnextScreen()
        }
    }
    companion object {
        const val TR_S = "transmittedString"
        const val TR_I = "transmittedInt"
        const val TR_B = "transmittedBoolean"
    }
    private fun moveTOnextScreen() {
        val intent = Intent(this, SecondActivity::class.java)
        val transmittedString = "string to transmit"
        intent.putExtra(TR_S, transmittedString)

        val transmittedInt = 12
        intent.putExtra(TR_I, transmittedString)

        val transmittedBoolean = false
        intent.putExtra(TR_B, transmittedString)

        startActivity(intent)
    }

}