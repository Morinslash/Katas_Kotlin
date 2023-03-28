package fizzBuzz

class FizzBuzz {
    fun convert(inputNumber: Int): String {
        if (inputNumber%3==0){
            return "Fizz"
        }
        return inputNumber.toString()
    }
}