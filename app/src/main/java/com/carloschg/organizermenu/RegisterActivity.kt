package com.carloschg.organizermenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    //Method for buttons to enter activity WeekActivity
    fun weekReg(v: View){
        val intent = Intent(this,WeekActivity::class.java)
        startActivity(intent)
    }
}