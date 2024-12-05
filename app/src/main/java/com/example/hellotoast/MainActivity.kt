package com.example.hellotoast

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hellotoast.R
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    // Initialize the counter variable
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find the Button and TextView elements from the layout
        val toastButton = findViewById<Button>(R.id.button_toast)
        val countButton = findViewById<Button>(R.id.button_count)
        val countTextView = findViewById<TextView>(R.id.textview_count)
        // Set a click listener for the Toast button
        toastButton.setOnClickListener {
            // Display a short Toast message
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        }
        // Set a click listener for the Count button
        countButton.setOnClickListener {
            // Increase the count and update the TextView
            count++
            countTextView.text = count.toString()
        }

    }
}