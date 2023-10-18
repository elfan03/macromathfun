package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class penjelasanlatihansoal1 : AppCompatActivity() {
    private lateinit var btnkembali: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penjelasanlatihansoal1)
        btnkembali=findViewById(R.id.btn_kembalipenjelasan)
        btnkembali.setOnClickListener {
            startActivity(Intent(this,latihansoalnomor1jawaban::class.java))
        }
    }
}