package com.ikari.testingtrainingci

class ViewMock : Presenter.View {
    var messageError: String? = null
    var hideLoginFormVerifier = false
    var showLoginFormVerifier = false
    var showLogoutFormVerifier = false
    var hideLogoutFormVerifier = false


    override fun showError(message: String) {
        messageError = message
    }

    override fun hideLoginForm() {
        hideLoginFormVerifier = true
    }

    override fun showLoginForm() {
        showLoginFormVerifier = true
    }

    override fun hideLogoutForm() {
        hideLogoutFormVerifier = true
    }

    override fun showLogoutForm() {
        showLogoutFormVerifier = true
    }


}