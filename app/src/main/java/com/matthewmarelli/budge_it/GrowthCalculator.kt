package com.matthewmarelli.budge_it


class GrowthCalculator (var monthlyIncome: Double, var monthlyExpenses : Double, var CAGR: Double){

    private var netMonthlyIncome = 0.0;

    fun calculateNetIncome() : String {
        netMonthlyIncome = monthlyIncome - monthlyExpenses
        val myText = "Net Monthly Income: " + netMonthlyIncome
        return myText
    }

    fun calculateFutureSavings(time : Int, savingsRate : Double) : String {
        val yearlyInput = 12 * (netMonthlyIncome * savingsRate)
        var sum = 0.0
        for (x in 1..time) {
            sum += yearlyInput
            sum += (sum * (CAGR/100.0))
        }

        val sumAsInt: Int = sum.toInt()
        var myString: String

        if (sumAsInt >= 1000000) {
            myString = "" + (sumAsInt / 1000.0).toInt() + "K"
        } else {
            myString = "" + sumAsInt
        }

        return myString
    }

}