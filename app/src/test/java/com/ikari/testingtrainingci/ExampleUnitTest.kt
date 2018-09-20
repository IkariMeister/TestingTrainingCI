package com.ikari.testingtrainingci

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val anyString = "gfdgdg"
    private val admin = "admin"
    private lateinit var sut : KataApp

    @Before
    fun setUp(){
        sut = KataApp()
    }

    @Test
    fun `Given admin as username and admin as password should return true`(){
        val result = sut.login(admin,admin)
        assertTrue(result)
    }
    @Test
    fun `Given admin as username and any password, not admin, should return true`(){
        val result = sut.login(admin,anyString)
        assertFalse(result)
    }
    @Test
    fun `Given any username, not admin, and admin as password should return false`(){
        val result = sut.login(anyString,admin)
        assertFalse(result)
    }

    @Test
    fun `Given any username, not admin, any string as password should return false`(){
        val result = sut.login(anyString,anyString)
        assertFalse(result)
    }

    @Test
    fun `Given an odd second logout should return true`(){
        val clock = ClockMock()
        clock.now = 2
        sut = KataApp(clock)
        val result = sut.logout()
        assertTrue(result)
    }

    @Test
    fun `Given an even second logout should return false`(){
        val clock = ClockMock()
        clock.now = 1
        sut = KataApp(clock)
        val result = sut.logout()
        assertFalse(result)
    }

//    @Test
//    fun `Given any username, not admin, any string as password should return false`(){
//        val result = sut.login(anyString,anyString)
//        assertFalse(result)
//    }
}
