package com.carloschg.organizermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WeekActivity : AppCompatActivity() {
    //Items para la lista
    val items:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)
        //Llamada al metodo
        addItems()
        val recyclerView = findViewById<RecyclerView>(R.id.pWeek_recyclerViewC)

        //Manager para RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = MyAdapter(items, this)
    }

    private fun addItems(){
        items.add("Menú Lunes")
        items.add("Menú Martes")
        items.add("Menú Miercoles")
        items.add("Menú Jueves")
        items.add("Menú Viernes")
        items.add("Menú Sabado")
        items.add("Menú Domingo")
    }
}