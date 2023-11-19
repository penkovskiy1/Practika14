package com.example.oneapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val t: TextView = findViewById(R.id.textView8)
        val t1: TextView = findViewById((R.id.textView9))
        val t2: TextView = findViewById(R.id.textView10)
        val vse = intent.extras
        val data = vse?.getString("data")
        val mail = vse?.getString("mail")
        val name = vse?.getString("name")
        t.text = (mail.toString())
        t1.text = (data.toString())
        t2.text = (name.toString())

        }
        fun b1Click(view: View) {
            val b1: Button = findViewById(R.id.button2)

            when (b1?.id) {
                R.id.button2 -> finish()

            }


        }
    }


