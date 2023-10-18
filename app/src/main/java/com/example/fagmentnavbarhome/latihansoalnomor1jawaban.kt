package com.example.fagmentnavbarhome

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihansoalnomor1jawaban : AppCompatActivity() {
    private lateinit var ivmasukpenjelasan: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihansoalnomor1jawaban)
        ivmasukpenjelasan=findViewById(R.id.ivpenejelasan)
        ivmasukpenjelasan.setOnClickListener {
            startActivity(Intent(this,penjelasanlatihansoal1::class.java))
        }
    }
}