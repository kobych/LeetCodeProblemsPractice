package array

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            digits[i] += 1
            if (digits[i] == 10) {
                digits[i] = 0
            } else return digits
        }
        val finalDigits = IntArray(digits.size + 1)
        finalDigits[0] = 1
        return finalDigits
    }
}

fun main() {
    val plusOne = PlusOne()
    println(plusOne.plusOne(intArrayOf(1, 2, 3)).toList())
}