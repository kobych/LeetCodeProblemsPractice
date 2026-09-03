package string

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val results = mutableListOf<String>()
        for (i in 1..n) {
            when {
                i % 15 == 0 -> results.add("FizzBuzz")
                i % 3 == 0 -> results.add("Fizz")
                i % 5 == 0 -> results.add("Buzz")
                else -> results.add(i.toString())
            }
        }
        return results
    }
}

fun main() {
    val fizzBuzz = FizzBuzz()
    println(fizzBuzz.fizzBuzz(15))
}