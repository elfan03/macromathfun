package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_menu_quiz : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_quiz)

        val btnspldv: Button = findViewById(R.id.btn_spldv)
        btnspldv.setOnClickListener(this)

        val btnaljabar: Button = findViewById(R.id.btn_aljabar)
        btnaljabar.setOnClickListener(this)

        val btnlinear: Button = findViewById(R.id.btn_linear)
        btnlinear.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_spldv -> {
                val intent = Intent(this@activity_menu_quiz, activity_Quiz_SPLDV1::class.java)
                startActivity(intent)
            }
            R.id.btn_aljabar -> {
                val intent = Intent(this@activity_menu_quiz, activity_Quiz_Aljabar::class.java)
                startActivity(intent)
            }
            R.id.btn_linear -> {
                val intent = Intent(this@activity_menu_quiz, activity_Quiz_FLinear1::class.java)
                startActivity(intent)
            }
        }
    }
}
