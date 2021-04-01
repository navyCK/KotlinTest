package com.navyCK.mykotlinapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val text = intent.getStringExtra("text")
        val id = intent.getStringExtra("id")
        val pw = intent.getStringExtra("pw")

        txtText.text = text
        txtId.text = "ID : $id"
        txtPw.text = "PW : $pw"

        btnBack.setOnClickListener() {
            finish()
        }
    }
}