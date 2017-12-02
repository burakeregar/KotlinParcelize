package com.burakeregar.kotlinparcelize

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("dataModel", PersonModel("Burak", 26))
        startActivity(intent)
    }
}
