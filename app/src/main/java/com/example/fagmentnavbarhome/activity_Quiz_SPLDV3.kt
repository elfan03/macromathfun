package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_Quiz_SPLDV3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_spldv3)
        val btnTiga: Button = findViewById(R.id.btn_tiga)
        btnTiga.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_tiga -> {
                val intent = Intent(this@activity_Quiz_SPLDV3, activity_Quiz_SPLDV4::class.java)
                startActivity(intent)
            }
        }
    }
}