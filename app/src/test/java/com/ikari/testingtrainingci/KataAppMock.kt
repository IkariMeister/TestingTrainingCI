package com.ikari.testingtrainingci

class KataAppMock : KataApp(ClockMock()) {

    var loginResult  = true
    var logoutResult  = true
    var validateResult  = true

    override fun login(user: String, pass:String) = loginResult
    override fun logout() = logoutResult
    override fun validateUserName(user: String) = validateResult
}