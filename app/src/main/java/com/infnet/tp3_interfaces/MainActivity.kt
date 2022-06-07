package com.infnet.tp3_interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRelativeActivity = this.findViewById<Button>(R.id.btnRelativeActivity)

        btnRelativeActivity.setOnClickListener {

                val relativeIntent = Intent(this, RelativeLayoutActivity::class.java)

                startActivity(relativeIntent)
            }
    }
}