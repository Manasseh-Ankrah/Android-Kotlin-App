package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    private lateinit var findTvDisplay: TextView
    private var strNumber = StringBuilder()
    private lateinit var numberButtons: Array<Button>
    private lateinit var numberOperations: List<Button>
    private var operator:Operator = Operator.NONE
    private var isOperatorClicked: Boolean = false
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

    private lateinit var buttonAdd: Button
    private lateinit var buttonSub: Button
    private lateinit var buttonMul: Button
    private lateinit var buttonDiv: Button
    private lateinit var buttonEquals: Button

    private var operand1: Int = 0
    private var operand2: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_main)

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

        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSub = findViewById(R.id.buttonSub)
        buttonMul = findViewById(R.id.buttonMul)
        buttonDiv = findViewById(R.id.buttonDiv)
        buttonEquals = findViewById(R.id.buttonEquals)

        // Initializing component
        initializedComponents()

    }

    private fun initializedComponents() {

        numberButtons = arrayOf(button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,)
        numberOperations = listOf(buttonAdd,buttonSub,buttonMul,buttonDiv)
        findTvDisplay = findViewById(R.id.tvDisplay)
        findTvDisplay.text = "0"

        for (i in numberButtons) {
            i.setOnClickListener { numberButtonClicked(i)}
        }

        for (i in numberOperations) {
            i.setOnClickListener { operatorButtonClick(i)}
        }

        buttonEquals.setOnClickListener { buttonEqualClick() }
    }



    private fun buttonEqualClick() {
        operand2 = strNumber.toString().toInt()
        var result:Int

        when(operator) {
            Operator.ADD -> result = operand1 + operand2
            Operator.MUL -> result = operand1 * operand2
            Operator.SUB -> result = operand1 * operand2
            Operator.DIV -> result = operand1 / operand2
            Operator.MUL -> result = operand1 * operand2
            else -> result = 0
        }

        strNumber.clear()
        strNumber.append(result.toString())
    }

    private fun operatorButtonClick( btn: Button) {
        if (btn.text == "+") {
            operator = Operator.ADD
        } else if (btn.text == "-") {
            operator = Operator.SUB
        }else if (btn.text == "*") {
            operator = Operator.MUL
        } else if (btn.text == "/") {
            operator = Operator.DIV
        } else {
            operator = Operator.NONE
        }

        isOperatorClicked = true

    }

    private fun numberButtonClicked(btn:Button) {
        if(isOperatorClicked) {
            operand1 = strNumber.toString().toInt()
            strNumber.clear()
            isOperatorClicked= false
        }
        strNumber.append(btn.text)
        findTvDisplay.text = strNumber
    }

}

enum class Operator {ADD,MUL,DIV,SUB,NONE}