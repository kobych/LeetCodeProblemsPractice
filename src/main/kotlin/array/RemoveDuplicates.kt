package array

class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var unique = 1 // Initial amount of unique numbers in array

        /*
        Starting enumerating index of array from 1 to n
        [1, 2, 3, ..,n]
        [1, 1, 2, 2, 3, 3]

        Comparing current element to previous
        If they are not equal, increment counter and put second of them to left

        1) [1, 1, 2, 2, 3, 3] 1 = 1
        2) [1, 2, 2, 2, 3, 3] 1 != 2 -> unique = 2 -> nums[3] = 2
        3) [1, 2, 2, 2, 3, 3] 2 = 2
        4) [1, 2, 3, 2, 3, 3] 2 != 3 -> unique = 3 -> nums[3] = 3
        */
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                unique++
                nums[unique - 1] = nums[i]
            }
        }
        return unique
    }
}

fun main() {
    val removeDuplicates = RemoveDuplicates()
    println(removeDuplicates.removeDuplicates(intArrayOf(1, 1, 2, 2, 3, 3)))
}