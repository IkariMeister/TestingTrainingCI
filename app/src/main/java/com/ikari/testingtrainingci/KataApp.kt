package com.ikari.testingtrainingci

open class KataApp(val clock:Clock = Clock()) {
    open fun login(user: String, pass: String) = user == "admin" && pass == "admin"
    open fun logout(): Boolean {
        return clock.now % 2 == 0
    }
    open fun validateUserName(user:String) = (!user.contains(",")) && !user.contains(".")
}
