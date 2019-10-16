package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  var btnLogin:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onBtnClick()
    }

    private fun onBtnClick() {
        btnLogin= findViewById<View>(R.id.btnLogin) as Button
        btnLogin!!.setOnClickListener{
            var intent=Intent(this@MainActivity,Secondaryactivity::class.java)
            startActivity(intent)
        }
    }
}
