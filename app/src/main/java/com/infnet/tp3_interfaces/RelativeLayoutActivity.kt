package com.infnet.tp3_interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val btnMudarActivityTable = this.findViewById<Button>(R.id.btnRelativeActivity)

        btnMudarActivityTable.setOnClickListener {

            val tableIntent = Intent(this, TableLayoutActivity::class.java)

            startActivity(tableIntent)
        }

    }
}