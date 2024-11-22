package com.example.laboratory_act


import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button
        val btnImplicit = findViewById<Button>(R.id.btn_implicit)

        // Set OnClickListener
        btnImplicit.setOnClickListener {
            // Create an implicit intent
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Code Android")
                type = "text/plain"
            }
            // Start activity with the intent
            startActivity(Intent.createChooser(intent, "Share via"))
        }
    }
}