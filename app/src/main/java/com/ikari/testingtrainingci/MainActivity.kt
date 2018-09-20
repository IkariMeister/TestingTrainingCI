package com.ikari.testingtrainingci

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app = KataApp()
        loginBtn.setOnClickListener {
            if(app.login(username.text.toString(),password.text.toString())){
                logoutBtn.visibility = View.VISIBLE
                loginBtn.visibility = View.GONE
                username.visibility = View.GONE
                password.visibility = View.GONE
            }
        }
        logoutBtn.setOnClickListener{
            if(app.logout()){
                logoutBtn.visibility = View.VISIBLE
                loginBtn.visibility = View.GONE
                username.visibility = View.GONE
                password.visibility = View.GONE
            }

        }
    }
}
