package com.example.cotlincalculator.data.calculator.storage

import com.example.cotlincalculator.domain.calculator.temp.CalculatorTemp
import javax.inject.Inject


class CalculatorStorage @Inject constructor(private val calculatorTemp: CalculatorTemp) {
    fun numberOh(number: String) {
        val zero = "0"
        calculatorTemp.checkNumber(number, zero)
    }

    fun numberOne(number: String) {
        val one = "1"
        calculatorTemp.checkNumber(number, one)
    }

    fun numberTwo(number: String) {
        val two = "2"
        calculatorTemp.checkNumber(number, two)
    }

    fun numberThree(number: String) {
        val three = "3"
        calculatorTemp.checkNumber(number, three)
    }

    fun numberFour(number: String) {
        val four = "4"
        calculatorTemp.checkNumber(number, four)
    }

    fun numberFive(number: String) {
        val five = "5"
        calculatorTemp.checkNumber(number, five)
    }

    fun numberSix(number: String) {
        val six = "6"
        calculatorTemp.checkNumber(number, six)
    }

    fun numberSeven(number: String) {
        val seven = "7"
        calculatorTemp.checkNumber(number, seven)
    }

    fun numberEight(number: String) {
        val eight = "8"
        calculatorTemp.checkNumber(number, eight)
    }

    fun numberNine(number: String) {
        val nine = "9"
        calculatorTemp.checkNumber(number, nine)
    }

    fun clear() {
        calculatorTemp.clear()
    }

    fun decrement() {
        calculatorTemp.decrement()
    }

    fun division() {
        calculatorTemp.division()
    }

    fun multiplication() {
        calculatorTemp.multiplication()
    }

    fun percent(number: String) {
        calculatorTemp.percent(number)
    }

    fun checkPlusOrMinus(number: String) {
        calculatorTemp.checkPlusOrMinus(number)
    }

    fun dot(number: String) {
        calculatorTemp.dot(number)
    }

    fun increment() {
        calculatorTemp.increment()
    }

    fun result() {
        calculatorTemp.result()
    }

    fun getResult(): String {
        return calculatorTemp.getResult()
    }
}