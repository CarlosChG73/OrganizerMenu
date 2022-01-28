package com.carloschg.organizermenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Método para poner el icono en ActionBar
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher);
    }

    //Method for buttons to enter activity UsersActivity
    fun enter(v: View){
        val intent = Intent(this,UsersActivity::class.java)
        startActivity(intent)
    }
}