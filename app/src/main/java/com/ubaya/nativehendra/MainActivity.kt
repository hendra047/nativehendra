package com.ubaya.nativehendra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // perlu bikin fitur login
    var login:Boolean = false
    var count:Int = 0

    //grace nambah :)
    var name = ""
    var time = ""
    var password = ""
    var username = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // function login
    fun login(){

    }

    fun dashboard() {

    }
}