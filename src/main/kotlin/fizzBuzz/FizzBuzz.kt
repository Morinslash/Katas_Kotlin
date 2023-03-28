package fizzBuzz

class FizzBuzz {
    fun convert(inputNumber: Int): String {
        if (inputNumber%3==0){
            return "Fizz"
        }
        if (inputNumber%5==0){
            return "Buzz"
        }
        return inputNumber.toString()
    }
}