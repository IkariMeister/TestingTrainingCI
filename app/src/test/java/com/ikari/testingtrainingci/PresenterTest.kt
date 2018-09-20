package com.ikari.testingtrainingci

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PresenterTest {
    lateinit var sut : Presenter
    lateinit var app : KataAppMock
    lateinit var view: ViewMock
    val anyString = ""


    @Before
    fun setup(){
        app = KataAppMock()
        view = ViewMock()
        sut = Presenter(view,app)
    }

    @Test
    fun `Given a valid username should call view hideLoginForm and showLogoutForm`(){
        app.loginResult = true
        sut.onLoginClick(anyString, anyString)
        assert(view.hideLoginFormVerifier)
        assert(view.showLogoutFormVerifier)
    }

    @Test
    fun `Given an valid unregistred username should call view showError`(){
        app.loginResult = false
        sut.onLoginClick(anyString, anyString)
        assertEquals("Login Incorrect",view.messageError)
    }

    @Test
    fun `Given an invalid username should call view showError`(){
        app.validateResult = false
        sut.onLoginClick(anyString, anyString)
        assertEquals("Invalid username",view.messageError)
    }

    @Test
    fun `When click logout button on even should call view show Error`(){
        app.logoutResult = false
        sut.onLogoutClick()
        assertEquals("Ops, I can't do it now",view.messageError)
    }

    @Test
    fun `When click logout button on odd should call view hideLogout and showLogin`(){
        app.logoutResult = true
        sut.onLogoutClick()
        assertTrue(view.hideLogoutFormVerifier)
        assertTrue(view.showLoginFormVerifier)
    }

}