package com.ikari.testingtrainingci

class Presenter(private val view: View, private val app:KataApp) {
    fun onLoginClick(user: String, pass: String) {
        when {
            !app.validateUserName(user) -> view.showError("Invalid username")
            app.login(user,pass) -> {
                view.hideLoginForm()
                view.showLogoutForm()
            }
            else -> view.showError("Login Incorrect")
        }
    }

    fun onLogoutClick() {
        if(app.logout()){
            view.showLoginForm()
            view.hideLogoutForm()
        }
        else{
            view.showError("Ops, I can't do it now")
        }
    }

    interface View {
        fun showError(message: String)
        fun hideLoginForm()
        fun showLoginForm()
        fun hideLogoutForm()
        fun showLogoutForm()
    }
}