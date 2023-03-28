package fizzBuzz

class FizzBuzz {
    fun convert(inputNumber: Int): String = when {
        inputNumber % 15 == 0 -> "FizzBuzz"
        inputNumber%3==0 -> "Fizz"
        inputNumber%5==0 -> "Buzz"
        else -> inputNumber.toString()
    }
}