package com.ikari.testingtrainingci

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn.setOnClickListener {
            if(username.text.toString()=="admin"&&password.text.toString()=="admin")
                loginBtn.text = "Log Out"
        }
    }
}
