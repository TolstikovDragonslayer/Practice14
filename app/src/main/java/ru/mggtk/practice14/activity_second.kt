package ru.mggtk.practice14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class activity_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //ET - EditText
        val ETage: EditText = findViewById(R.id.ETage_ed)
        val ETphone: EditText = findViewById(R.id.ETphone_ed)
        val ETemail: EditText = findViewById(R.id.ETemail_ed)

        //AM - activity_main
        val AMdata: Bundle? = intent.extras

        
    }
}