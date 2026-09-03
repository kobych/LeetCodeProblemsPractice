package array

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            numsMap[num]?.let { return intArrayOf(it, index) }
            numsMap[target - num] = index
        }
        return intArrayOf()
    }
}

fun main() {
    val numbers = intArrayOf(3, 2, 4)
    val target = 6

    val twoSum = TwoSum()
    println(twoSum.twoSum(numbers, target).toList())
}
