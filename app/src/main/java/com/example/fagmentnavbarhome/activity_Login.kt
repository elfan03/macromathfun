package com.example.fagmentnavbarhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class activity_Login : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var tvmendaftar : TextView
    private lateinit var tvlupapassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button=findViewById(R.id.btnmasuk)
        tvmendaftar = findViewById(R.id.tvmendaftar)
        tvlupapassword = findViewById(R.id.tvlupapassword)


        tvmendaftar.setOnClickListener {
            startActivity(Intent(this,activity_Buat_Akun::class.java))
        }
        tvlupapassword.setOnClickListener {
            startActivity(Intent(this,activity_lupa_kata_sandi::class.java))
        }

        button.setOnClickListener {
            val username = "admin"
            val password = "1234"
            val username2 = "202165012"
            val password2 = "1234"
            val txtusername = findViewById<EditText>(R.id.edt_masukanusername).text.toString()
            val txtpassword = findViewById<EditText>(R.id.edt_masukansandi).text.toString()
            if (username==txtusername&&password==txtpassword){
                startActivity(Intent(this, MainActivity::class.java))
            }
            else if(username2==txtusername&&password2==txtpassword) {
                startActivity(Intent(this, MainActivity::class.java))
            }
            else{
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}