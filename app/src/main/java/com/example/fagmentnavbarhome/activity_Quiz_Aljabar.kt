package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_Quiz_Aljabar : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_aljabar)
        val btnEmpat: Button = findViewById(R.id.btn_empat)
        btnEmpat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_empat -> {
                val intent = Intent(this@activity_Quiz_Aljabar, activity_Quiz_Aljbar2::class.java)
                startActivity(intent)
            }
        }
    }
}