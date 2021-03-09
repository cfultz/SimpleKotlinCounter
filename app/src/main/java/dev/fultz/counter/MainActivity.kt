package dev.fultz.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup values and variables for our button, textView, and define default number of clicks

        val btnTapTap = findViewById<Button>(R.id.button)
        var textTapTap = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        // Call button with ClickListener to add +1 to the textView

        btnTapTap.setOnClickListener{
            timesClicked += 1
            textTapTap.text= timesClicked.toString()
        }

    }
}