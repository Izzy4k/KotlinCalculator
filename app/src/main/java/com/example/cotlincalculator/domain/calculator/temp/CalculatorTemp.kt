package com.example.cotlincalculator.domain.calculator.temp

import com.example.cotlincalculator.domain.calculator.entity.CalculatorEntity
import javax.inject.Inject
import kotlin.math.roundToInt

class CalculatorTemp @Inject constructor(private val calculatorEntity: CalculatorEntity) {


    fun clear() {
        calculatorEntity.a = 0.0
        calculatorEntity.b = 0.0
        calculatorEntity.first = ""
        calculatorEntity.second = ""
        calculatorEntity.isOperation = false
        calculatorEntity.result = "0"

    }

    fun decrement() {
        if (calculatorEntity.first.isNotBlank()) {
            calculatorEntity.a = calculatorEntity.first.toDouble()
            calculatorEntity.isOperation = true
            calculatorEntity.resultToString = "-"
        }
    }

    fun division() {
        if (calculatorEntity.first.isNotBlank()) {
            calculatorEntity.a = calculatorEntity.first.toDouble()
            calculatorEntity.isOperation = true
            calculatorEntity.resultToString = "/"
        }
    }

    fun multiplication() {
        if (calculatorEntity.first.isNotBlank()) {
            calculatorEntity.a = calculatorEntity.first.toDouble()
            calculatorEntity.isOperation = true
            calculatorEntity.resultToString = "x"
        }
    }

    fun increment() {
        if (calculatorEntity.first.isNotBlank()) {
            calculatorEntity.a = calculatorEntity.first.toDouble()
            calculatorEntity.isOperation = true
            calculatorEntity.resultToString = "+"
        }
    }

    fun checkNumber(number: String, numeral: String) {
        if (calculatorEntity.isOperation) {
            if (number == "0") {
                calculatorEntity.second = numeral
                calculatorEntity.result = calculatorEntity.second
            } else {
                calculatorEntity.second = calculatorEntity.second + numeral
                calculatorEntity.result = calculatorEntity.second
            }
        } else {
            if (number == "0") {
                calculatorEntity.first = numeral
                calculatorEntity.result = calculatorEntity.first
            } else {
                calculatorEntity.first = calculatorEntity.first + numeral
                calculatorEntity.result = calculatorEntity.first
            }
        }
    }

    private fun save(number: Double) {
        if (number % 1 == 0.0) {
            calculatorEntity.result = number.roundToInt().toString()
        } else {
            calculatorEntity.result = number.toString()
        }
    }

    fun result() {
        val temp: Double
        if (calculatorEntity.second.isNotBlank()) {
            calculatorEntity.b = calculatorEntity.second.toDouble()
            if (calculatorEntity.resultToString.isBlank()) return
            when (calculatorEntity.resultToString) {
                "+" -> {
                    temp = calculatorEntity.a + calculatorEntity.b
                    save(temp)
                }
                "-" -> {
                    temp = calculatorEntity.a - calculatorEntity.b
                    save(temp)
                }
                "x" -> {
                    temp = calculatorEntity.a * calculatorEntity.b
                    save(temp)
                }
                "/" -> if (calculatorEntity.a != 0.0) {
                    temp = calculatorEntity.a / calculatorEntity.b
                    save(temp)
                } else {
                    calculatorEntity.result = "0"
                }
            }
            fastClear()
        }
    }

    private fun fastClear() {
        calculatorEntity.first = calculatorEntity.result
        calculatorEntity.second = ""
        calculatorEntity.isOperation = false
    }

    fun percent(number: String) {
        if (number.isNotBlank()) {
            calculatorEntity.a = number.toDouble()
            calculatorEntity.a /= 100.0
            calculatorEntity.result = calculatorEntity.a.toString()
            fastClear()
        }
    }

    fun checkPlusOrMinus(number: String) {
        if (number == "0") return
        if (calculatorEntity.isOperation) {
            if (number.contains("-")) {
                calculatorEntity.result = number.substring(1)
            } else {
                calculatorEntity.result = "-$number"
            }
            calculatorEntity.second = calculatorEntity.result
        } else {
            if (number.contains("-")) {
                calculatorEntity.result = number.substring(1)
            } else {
                calculatorEntity.result = "-$number"
            }
            calculatorEntity.first = calculatorEntity.result
        }
    }

    fun dot(number: String) {
        if (calculatorEntity.isOperation) {
            if (!number.contains(".")) {
                calculatorEntity.result = "$number."
            } else {
                calculatorEntity.result = number
            }
            calculatorEntity.second = calculatorEntity.result
        } else {
            if (!number.contains(".")) {
                calculatorEntity.result = "$number."
            } else {
                calculatorEntity.result = number
            }
            calculatorEntity.first = calculatorEntity.result
        }
    }

    fun getResult(): String {
        return calculatorEntity.result
    }
}