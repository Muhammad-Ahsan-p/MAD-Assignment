package com.example.labassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnLinear:Button
    private lateinit var btnRelative: Button
    private lateinit var btnConstrain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLinear= findViewById(R.id.btn_linear)
        btnRelative = findViewById(R.id.btn_relative)
        btnConstrain =findViewById(R.id.btn_constrain)

        btnLinear.setOnClickListener {
            val linearIntent = Intent(this, Linear::class.java)
            startActivity(linearIntent)
        }
        btnRelative.setOnClickListener {
            val relativeIntent = Intent(this, Relative::class.java)
            startActivity(relativeIntent)
        }
        btnConstrain.setOnClickListener {
            val constrainIntent = Intent(this, Constrain::class.java)
            startActivity(constrainIntent)
        }
    }
}