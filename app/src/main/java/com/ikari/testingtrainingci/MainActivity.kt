package com.ikari.testingtrainingci

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Presenter.View {

    private val presenter = Presenter(this,KataApp())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn.setOnClickListener {
            presenter.onLoginClick(username.text.toString(),password.text.toString())
        }
        logoutBtn.setOnClickListener{presenter.onLogoutClick()}
    }

    override fun showError(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun hideLoginForm() {
        loginBtn.visibility = View.GONE
        username.visibility = View.GONE
        password.visibility = View.GONE
    }

    override fun showLoginForm() {
        loginBtn.visibility = View.VISIBLE
        username.visibility = View.VISIBLE
        password.visibility = View.VISIBLE
        username.setText("")
        password.setText("")
    }

    override fun hideLogoutForm() {
        logoutBtn.visibility = View.GONE
    }

    override fun showLogoutForm() {
        logoutBtn.visibility = View.VISIBLE
    }
}
