package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.R

class CalculatorActivity : AppCompatActivity() {
    private lateinit var findTvDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_main)

        val num1 = 5
        val num2 = 10
        val sum = num1 + num2

        // Referencing R.id.tvDisplay
        findTvDisplay  = findViewById(R.id.tvDisplay)
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
            button0Clicked(findTvDisplay)
        }
        button1.setOnClickListener {
            button1Clicked(findTvDisplay)
        }
        button2.setOnClickListener {
            button2Clicked(findTvDisplay)
        }
        button3.setOnClickListener {
            button3Clicked(findTvDisplay)
        }
        button4.setOnClickListener {
            button4Clicked(findTvDisplay)
        }
        button5.setOnClickListener {
            button5Clicked(findTvDisplay)
        }
        button6.setOnClickListener {
            button6Clicked(findTvDisplay)
        }
        button7.setOnClickListener {
            button7Clicked(findTvDisplay)
        }
        button8.setOnClickListener {
            button8Clicked(findTvDisplay)
        }
        button9.setOnClickListener {
            button9Clicked(findTvDisplay)
        }

    }

    private fun button8Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "9"
    }

    private fun button9Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "8"
    }

    private fun button7Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "7"
    }

    private fun button6Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "6"
    }

    private fun button5Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "5"
    }

    private fun button4Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "4"
    }

    private fun button3Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "3"
    }

    private fun button2Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "2"
    }

    private fun button0Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "0"
    }

    private fun button1Clicked(findTvDisplay: TextView) {
        findTvDisplay.text = "1"
    }
}