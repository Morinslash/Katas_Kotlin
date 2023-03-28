package fizzBuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class FizzBuzzShould {
    @ParameterizedTest
    @ValueSource(ints = [1,2,4])
    fun `return number as string when number provided`(number: Int){
        val fizzBuzz = FizzBuzz()
        assertEquals(number.toString(), fizzBuzz.convert(number))
    }
    @ParameterizedTest
    @ValueSource(ints = [3,6,9])
    fun `return Fizz when number is divisible by 3`(number: Int){
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.convert(number))
    }
    @ParameterizedTest
    @ValueSource(ints = [5,10,20])
    fun `return Buzz when number is divisible by 5`(number: Int){
        val fizzBuzz = FizzBuzz()
        assertEquals("Buzz", fizzBuzz.convert(number))
    }
}