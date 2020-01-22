package com.burakeregar.kotlinparcelize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.extras?.getParcelable<PersonModel>("dataModel")

        toast("Name: ${person?.name} age: ${person?.age}")
    }
}
