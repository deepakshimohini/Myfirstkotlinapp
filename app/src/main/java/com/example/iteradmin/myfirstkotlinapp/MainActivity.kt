package com.example.iteradmin.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt= findViewById<TextView>(R.id.developer)
        val bt1= findViewById<Button>(R.id.thanos)
        val bt2= findViewById<Button>(R.id.iron)

        bt1.setOnClickListener {
            txt.setText("no,you are a biggner developer")
        }
    }
}
