package com.example.helloworldandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var txtName : EditText
    lateinit var btnClick : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        btnClick = findViewById(R.id.btnButton)

        btnClick.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v : View?){
                var getText = txtName.text.toString()
                Toast.makeText(applicationContext, "Hello World! " + getText, Toast.LENGTH_LONG).show()
            }
        })
    }
}