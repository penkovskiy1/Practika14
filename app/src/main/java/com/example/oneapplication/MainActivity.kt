package com.example.oneapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun b1Click(view: View){
        val b1: Button = findViewById(R.id.button)

        val name: EditText = findViewById(R.id.editTextText)
        val data: EditText = findViewById(R.id.editTextDate)
        val mail: EditText = findViewById(R.id.editTextTextEmailAddress)

        val intent: Intent = Intent(this@MainActivity,TwoActivity::class.java)

        intent.putExtra("name" , name.text.toString())
        intent.putExtra("data" , data.text.toString())
        intent.putExtra("mail" , mail.text.toString())


        when(view.id){
            R.id.button -> startActivity(intent)

        }
    }
}