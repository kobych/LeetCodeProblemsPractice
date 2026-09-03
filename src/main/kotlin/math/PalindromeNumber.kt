package math

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val numString = x.toString()
        val numReversed = numString.reversed()
        return numString == numReversed
    }
}

fun main() {
    val palindromeNumber = PalindromeNumber()
    println(palindromeNumber.isPalindrome(101))
}