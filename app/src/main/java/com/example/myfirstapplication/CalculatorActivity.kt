package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.R

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_main)

        val num1 = 5
        val num2 = 10
        val sum = num1 + num2

        // Referencing R.id.tvDisplay
        val findTvDisplay: TextView = findViewById(R.id.tvDisplay)
        findTvDisplay.text = sum.toString()

        // Referencing All Layout Elements
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)

        // Setting Onclick Handler

        button0.setOnClickListener {
            findTvDisplay.text = "0"
        }
        button1.setOnClickListener {
            findTvDisplay.text = "1"
        }
        button2.setOnClickListener {
            findTvDisplay.text = "2"
        }
        button3.setOnClickListener {
            findTvDisplay.text = "3"
        }
        button4.setOnClickListener {
            findTvDisplay.text = "4"
        }
        button5.setOnClickListener {
            findTvDisplay.text = "5"
        }
        button6.setOnClickListener {
            findTvDisplay.text = "6"
        }
        button7.setOnClickListener {
            findTvDisplay.text = "7"
        }
        button8.setOnClickListener {
            findTvDisplay.text = "8"
        }
        button9.setOnClickListener {
            findTvDisplay.text = "9"
        }




    }
}