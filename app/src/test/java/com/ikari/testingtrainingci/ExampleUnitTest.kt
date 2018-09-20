package com.ikari.testingtrainingci

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val anyString = "gfdgdg"
    private val admin = "admin"

    @Test
    fun `Given admin as username and admin as password should return true`(){
        val result = login(admin,admin)
        assertTrue(result)
    }
    @Test
    fun `Given admin as username and any password, not admin, should return true`(){
        val result = login(admin,anyString)
        assertFalse(result)
    }
    @Test
    fun `Given any username, not admin, and admin as password should return false`(){
        val result = login(anyString,admin)
        assertFalse(result)
    }

    @Test
    fun `Given any username, not admin, any string as password should return false`(){
        val result = login(anyString,anyString)
        assertFalse(result)
    }
}
