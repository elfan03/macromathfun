package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_Quiz_FLinear1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_flinear1)
        val btnDua: Button = findViewById(R.id.btn_dua)
        btnDua.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_dua -> {
                val intent = Intent(this@activity_Quiz_FLinear1, actvity_Quiz_FLinear2::class.java)
                startActivity(intent)
            }
        }
    }
    }