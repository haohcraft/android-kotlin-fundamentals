    package com.example.basicappanatony

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


    class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        var countUpButton: Button = findViewById(R.id.count_up_button)

        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
    }

        private fun countUp() {
            val resultText: TextView = findViewById(R.id.result_text)
            val currentCount: Int? = resultText.text.toString().toIntOrNull(10)
            if (currentCount !== null && currentCount < 6) {
                resultText.text = (currentCount + 1).toString()
            } else {
                resultText.text = "0"
            }

        }

        private fun rollDice() {
            val resultText: TextView = findViewById(R.id.result_text)
            val randomInt = Random().nextInt(6) + 1
            resultText.text = randomInt.toString()
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
}
