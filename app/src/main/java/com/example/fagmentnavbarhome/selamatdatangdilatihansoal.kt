package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class selamatdatangdilatihansoal : AppCompatActivity() {
    private lateinit var buttonmasuk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selamatdatangdilatihansoal)
        buttonmasuk = findViewById(R.id.btnmulai)
        buttonmasuk.setOnClickListener {
            startActivity(Intent(this, latihansoalnomor1::class.java))
        }
    }
}