package com.ikari.testingtrainingci

import java.util.*

open class Clock {
    open var now = Calendar.getInstance().time.seconds
}