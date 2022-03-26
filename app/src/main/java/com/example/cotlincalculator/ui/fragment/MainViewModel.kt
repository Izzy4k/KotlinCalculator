package com.example.cotlincalculator.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cotlincalculator.data.calculator.storage.CalculatorStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val calculatorStorage: CalculatorStorage
) :
    ViewModel() {
    val result: MutableLiveData<String> = MutableLiveData()


    fun numberOh(number: String) {
        calculatorStorage.numberOh(number)
        init()
    }

    private fun init() {
        result.value = calculatorStorage.getResult()
    }

    fun numberOne(number: String) {
        calculatorStorage.numberOne(number)
        init()
    }

    fun numberTwo(number: String) {
        calculatorStorage.numberTwo(number)
        init()
    }

    fun numberThree(number: String) {
        calculatorStorage.numberThree(number)
        init()
    }

    fun numberFour(number: String) {
        calculatorStorage.numberFour(number)
        init()
    }

    fun numberFive(number: String) {
        calculatorStorage.numberFive(number)
        init()
    }

    fun numberSix(number: String) {
        calculatorStorage.numberSix(number)
        init()
    }

    fun numberSeven(number: String) {
        calculatorStorage.numberSeven(number)
        init()
    }

    fun numberEight(number: String) {
        calculatorStorage.numberEight(number)
        init()
    }

    fun numberNine(number: String) {
        calculatorStorage.numberNine(number)
        init()
    }

    fun clear() {
        calculatorStorage.clear()
        init()
    }

    fun increment() {
        calculatorStorage.increment()
        init()
    }

    fun decrement() {
        calculatorStorage.decrement()
        init()
    }

    fun multiplication() {
        calculatorStorage.multiplication()
        init()
    }

    fun division() {
        calculatorStorage.division()
        init()
    }

    fun dot(number: String) {
        calculatorStorage.dot(number)
        init()
    }

    fun plusOrMinus(number: String) {
        calculatorStorage.checkPlusOrMinus(number)
        init()
    }

    fun present(number: String) {
        calculatorStorage.percent(number)
        init()
    }

    fun result() {
        calculatorStorage.result()
        init()
    }
}