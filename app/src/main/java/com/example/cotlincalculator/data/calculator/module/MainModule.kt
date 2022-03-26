package com.example.cotlincalculator.data.calculator.module

import com.example.cotlincalculator.data.calculator.storage.CalculatorStorage
import com.example.cotlincalculator.domain.calculator.temp.CalculatorTemp
import com.example.cotlincalculator.domain.calculator.entity.CalculatorEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun calculatorEntity(): CalculatorEntity {
        return CalculatorEntity()
    }

    @Provides
    fun calTemp(calculatorEntity: CalculatorEntity): CalculatorTemp {
        return CalculatorTemp(calculatorEntity)
    }

    @Provides
    fun calculatorStorage(calculatorTemp: CalculatorTemp): CalculatorStorage {
        return CalculatorStorage(calculatorTemp)
    }
}