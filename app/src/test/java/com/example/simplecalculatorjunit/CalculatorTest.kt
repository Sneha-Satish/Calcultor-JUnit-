package com.example.simplecalculatorjunit

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        assertEquals(9, calculator.add(4, 5))
    }

    @Test
    fun testSubtraction() {
        assertEquals(3, calculator.subtract(8, 5))
    }

    @Test
    fun testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5))
    }

    @Test
    fun testDivision() {
        assertEquals(2, calculator.divide(10, 5))
    }

    @Test
    fun testDivisionByZero() {
        try {
            calculator.divide(10, 0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Division by zero is not allowed", e.message)
        }
    }

    @Test
    fun testDivisionByNegative() {
        assertEquals(-2, calculator.divide(10, -5))
    }


    @Test
    fun testAdditionWithNegativeNumbers() {
        assertEquals(1, calculator.add(-4, 5))
    }

    @Test
    fun testLargeNumberAddition() {
        assertEquals(1000000000, calculator.add(500000000, 500000000))
    }

    @Test
    fun testNegativeSubtraction() {
        assertEquals(-1, calculator.subtract(4, 5))
    }

    @Test
    fun testZeroMultiplication() {
        assertEquals(0, calculator.multiply(10, 0))
    }

    @Test
    fun testInvalidInput() {
        try {
            calculator.divide(0, 0)
        } catch (e: ArithmeticException) {
            assertEquals("Cannot divide by zero", e.message)
        }
    }

    @Test
    fun testLargeNegativeAddition() {
        assertEquals(-1000000000, calculator.add(-500000000, -500000000))
    }
}
