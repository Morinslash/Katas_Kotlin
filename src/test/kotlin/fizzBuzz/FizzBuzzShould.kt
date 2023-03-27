package fizzBuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzShould {
    @Test
    fun `return 1 as a string when 1 provided`(){
        val fizzBuzz = FizzBuzz()
        assertEquals("1",fizzBuzz.convert(1))
    }
}