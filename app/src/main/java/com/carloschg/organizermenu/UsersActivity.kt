package com.carloschg.organizermenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UsersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
    }

    //Method for buttons to enter activity RegisterActivity
    fun register(v: View){
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

    //Method for buttons to enter activity WeekActivity
    fun weekEnter(v: View){
        val intent = Intent(this,WeekActivity::class.java)
        startActivity(intent)
    }

    //Method for buttons to enter activity InfoActivity
    fun info(v: View){
        val intent = Intent(this,InfoActivity::class.java)
        startActivity(intent)
    }
}