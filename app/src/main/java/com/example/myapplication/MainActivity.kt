package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val towns = arrayOf("Nothing selected","Oldenburg","Farel","Wilhemshaven","Bremen","Hude","Stuttgart",
                "Berlin","Dresden","Frankfurt","Koln")

        val spTowns: Spinner? = findViewById(R.id.spTowns)
        val tvTowns = findViewById<TextView>(R.id.tvTowns)

        val adapter =
                ArrayAdapter.createFromResource(this,R.array.towns,
                        android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spTowns?.adapter= adapter

        spTowns?.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                tvTowns.text = selectedItem
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        })

        }


    }