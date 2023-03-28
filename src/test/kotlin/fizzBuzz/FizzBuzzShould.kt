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
}