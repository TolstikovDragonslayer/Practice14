package ru.mggtk.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ET - EditText
        val ETage: EditText = findViewById(R.id.ETage)
        val ETphone: EditText = findViewById(R.id.ETphone)
        val ETemail: EditText = findViewById(R.id.ETemail)
        val editIntent: Intent = Intent(this@MainActivity, activity_second::class.java)

        editIntent.putExtra(ETage.text.toString(), "age")
        editIntent.putExtra(ETphone.text.toString(), "phone")
        editIntent.putExtra(ETemail.text.toString(), "email")

    }
}