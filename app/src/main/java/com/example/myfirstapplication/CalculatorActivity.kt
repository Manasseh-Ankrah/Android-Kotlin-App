package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.R

class CalculatorActivity : AppCompatActivity() {
    private lateinit var findTvDisplay: TextView
    private var strNumber: String = ""
    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_main)

        // Referencing R.id.tvDisplay
        findTvDisplay = findViewById(R.id.tvDisplay)
        findTvDisplay.text = "0"

        // Referencing All Layout Elements
        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        // Setting Onclick Handler
        initializedComponents()

    }

    private fun initializedComponents() {

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


    private fun button9Clicked(findTvDisplay: TextView) {
        strNumber += "9"
        findTvDisplay.text = strNumber
    }

    private fun button8Clicked(findTvDisplay: TextView) {
        strNumber += "8"
        findTvDisplay.text = strNumber
    }

    private fun button7Clicked(findTvDisplay: TextView) {
        strNumber += "7"
        findTvDisplay.text = strNumber
    }

    private fun button6Clicked(findTvDisplay: TextView) {
        strNumber += "6"
        findTvDisplay.text = strNumber
    }

    private fun button5Clicked(findTvDisplay: TextView) {
        strNumber += "5"
        findTvDisplay.text = strNumber
    }

    private fun button4Clicked(findTvDisplay: TextView) {
        strNumber += "4"
        findTvDisplay.text = strNumber
    }

    private fun button3Clicked(findTvDisplay: TextView) {
        strNumber += "3"
        findTvDisplay.text = strNumber
    }

    private fun button2Clicked(findTvDisplay: TextView) {
        strNumber += "2"
        findTvDisplay.text = strNumber
    }

    private fun button1Clicked(findTvDisplay: TextView) {
        strNumber += "1"
        findTvDisplay.text = strNumber
    }

    private fun button0Clicked(findTvDisplay: TextView) {
        strNumber += "0"
        findTvDisplay.text = strNumber
    }
}