package com.example.fagmentnavbarhome

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class latihansoalnomor1 : AppCompatActivity() {
    private lateinit var ivmmasuk: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihansoalnomor1)
        ivmmasuk=findViewById(R.id.ivjawaban1A)
        ivmmasuk.setOnClickListener {
            startActivity(Intent(this,latihansoalnomor1jawaban::class.java))
        }
    }
}