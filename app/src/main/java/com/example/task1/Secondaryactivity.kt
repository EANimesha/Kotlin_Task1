package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Secondaryactivity : AppCompatActivity() {
    private var BtnLoginActivity:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondaryactivity)
        initialise()
    }

    private fun initialise() {
        BtnLoginActivity= findViewById<Button>(R.id.btnFbLogin)
        BtnLoginActivity!!.setOnClickListener{
            var intent=Intent(this@Secondaryactivity,LastActivity::class.java)
            startActivity(intent)
        }
    }
}
