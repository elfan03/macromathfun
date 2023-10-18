package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class activity_menu_latihan : AppCompatActivity() {
    private lateinit var btnaljabar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_latihan)
        btnaljabar=findViewById(R.id.btn_aljabar)
        btnaljabar.setOnClickListener {
            startActivity(Intent(this,selamatdatangdilatihansoal::class.java))
        }
    }
}