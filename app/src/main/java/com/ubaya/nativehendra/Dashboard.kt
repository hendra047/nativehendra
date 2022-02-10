package com.ubaya.nativehendra

class Dashboard(var username:String) {
    override fun toString(): String {
        return "Welcome, $username"
    }

    fun getData():Array<String> {
        return arrayOf("Data 1", "Data 2")
    }
}