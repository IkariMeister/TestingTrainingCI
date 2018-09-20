package com.ikari.testingtrainingci

import java.util.*

class KataApp(val clock:Clock = Clock()) {
    fun login(user: String, pass: String) = user == "admin" && pass == "admin"
    fun logout(): Boolean {
        return clock.now % 2 == 0
    }
}
