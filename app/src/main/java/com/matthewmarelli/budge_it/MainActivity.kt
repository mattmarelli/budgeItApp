package com.matthewmarelli.budge_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.NoCopySpan
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myCalculator = GrowthCalculator(0.0, 0.0, 0.0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        inputMonthlyIncome.addTextChangedListener( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(s.toString().length > 0) {
                    myCalculator.monthlyIncome = s.toString().toDouble()
                } else {
                    myCalculator.monthlyIncome = 0.0
                }
                netMonthlyIncomeTextBox.text = myCalculator.calculateNetIncome()
                if (myCalculator.CAGR > 0.0) {
                    //updateTable()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        inputMonthlyExpenses.addTextChangedListener( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(s.toString().length > 0) {
                    myCalculator.monthlyExpenses = s.toString().toDouble()
                } else {
                    myCalculator.monthlyExpenses = 0.0
                }
                netMonthlyIncomeTextBox.text = myCalculator.calculateNetIncome()
                if (myCalculator.CAGR > 0.0) {
                    //updateTable()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        inputCAGR.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(s.toString().length > 0) {
                    myCalculator.CAGR = s.toString().toDouble()
                } else {
                    myCalculator.CAGR = 0.0
                }
                //updateTable()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

    }

//    fun updateTable() {
//        fiveYearFivePercentTextBox.text = myCalculator.calculateFutureSavings(5, .05)
//        tenYearFivePercentTextBox.text = myCalculator.calculateFutureSavings(10, .05)
//        fifteenYearFivePercentTextBox.text = myCalculator.calculateFutureSavings(15, .05)
//        twentyYearFivePercentTextBox.text = myCalculator.calculateFutureSavings(20, .05)
//        twentyFiveYearFivePercentTextBox.text = myCalculator.calculateFutureSavings(25, .05)
//
//        fiveYearTenPercentTextBox.text = myCalculator.calculateFutureSavings(5, .1)
//        tenYearTenPercentTextBox.text = myCalculator.calculateFutureSavings(10, .1)
//        fifteenYearTenPercentTextBox.text = myCalculator.calculateFutureSavings(15, .1)
//        twentyYearTenPercentTextBox.text = myCalculator.calculateFutureSavings(20, .1)
//        twentyFiveYearTenPercentTextBox.text = myCalculator.calculateFutureSavings(25, .1)
//
//        fiveYearFifteenPercentTextBox.text = myCalculator.calculateFutureSavings(5, .15)
//        tenYearFifteenPercentTextBox.text = myCalculator.calculateFutureSavings(10, .15)
//        fifteenYearFifteenPercentTextBox.text = myCalculator.calculateFutureSavings(15, .15)
//        twentyYearFifteenPercentTextBox.text = myCalculator.calculateFutureSavings(20, .15)
//        twentyFiveYearFifteenPercentTextBox.text = myCalculator.calculateFutureSavings(25, .15)
//
//        fiveYearTwentyPercentTextBox.text = myCalculator.calculateFutureSavings(5, .20)
//        tenYearTwentyPercentTextBox.text = myCalculator.calculateFutureSavings(10, .20)
//        fifteenYearTwentyPercentTextBox.text = myCalculator.calculateFutureSavings(15, .20)
//        twentyYearTwentyPercentTextBox.text = myCalculator.calculateFutureSavings(20, .20)
//        twentyFiveYearTwentyPercentTextBox.text = myCalculator.calculateFutureSavings(25, .20)
//
//        fiveYearTwentyFivePercentTextBox.text = myCalculator.calculateFutureSavings(5, .25)
//        tenYearTwentyFivePercentTextBox.text = myCalculator.calculateFutureSavings(10, .25)
//        fifteenYearTwentyFivePercentTextBox.text = myCalculator.calculateFutureSavings(15, .25)
//        twentyYearTwentyFivePercentTextBox.text = myCalculator.calculateFutureSavings(20, .25)
//        twentyFiveYearTwentyFivePercentTextBox.text = myCalculator.calculateFutureSavings(25, .25)
//    }

}
