package com.navyCK.mykotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener() {
            Toast.makeText(this, "TOAST 버튼 눌렀다.", Toast.LENGTH_SHORT).show()
        }

        val subIntent = Intent(this, SubActivity::class.java)

        btnIntent.setOnClickListener() {
            val id = editID.text.toString()
            val pw = editPW.text.toString()

            subIntent.putExtra("text", "인텐트 이용하여 값 받기")
            subIntent.putExtra("id", id)
            subIntent.putExtra("pw", pw)

            startActivity(subIntent)
        }
    }
}