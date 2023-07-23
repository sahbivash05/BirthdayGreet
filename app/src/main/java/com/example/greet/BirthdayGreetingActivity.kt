package com.example.greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class BirthdayGreetingActivity : ComponentActivity() {
    companion object {
        const val NAME_EXTRA = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.birthdayGreeting).text = "Happy Birthday\n$name!"
    }
}