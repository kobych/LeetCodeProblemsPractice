package array

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var single = 0
        for (i in nums) {
            single = i xor single
        }
        return single
    }
}

fun main() {
    val singleNumber = SingleNumber()
    println(singleNumber.singleNumber(intArrayOf(3, 2, 3, 2, 4, 4, 1)))
}