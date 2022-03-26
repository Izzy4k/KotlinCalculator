package com.example.cotlincalculator.domain.calculator.entity


data class CalculatorEntity(
    var first: String = "",
    var second: String = "",
    var isOperation: Boolean = false,
    var a: Double = 0.0,
    var b: Double = 0.0,
    var result: String = "0",
    var resultToString: String = ""
)




