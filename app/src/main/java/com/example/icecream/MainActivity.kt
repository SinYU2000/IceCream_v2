 package com.example.icecream

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {


     private var add_btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_btn = findViewById(R.id.add)

        add_btn?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent()
                intent.setClass(this@MainActivity, AddTask::class.java)
                startActivity(intent);
            }

        })

    }

}
