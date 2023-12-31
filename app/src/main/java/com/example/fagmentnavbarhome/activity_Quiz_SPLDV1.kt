package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_Quiz_SPLDV1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_spldv1)

        val btnSatu: Button = findViewById(R.id.btn_satu)
        btnSatu.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_satu -> {
                val intent = Intent(this@activity_Quiz_SPLDV1, activity_Quiz_SPLDV2::class.java)
                startActivity(intent)
            }
        }
    }
}