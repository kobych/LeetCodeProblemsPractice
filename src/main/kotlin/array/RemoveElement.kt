package array

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var j = 0 // Index where we can put the number
        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                nums[j] = nums[i]
                j++
            }
        }
        return j
    }
}

fun main() {
    val removeElement = RemoveElement()
    println(removeElement.removeElement(intArrayOf(1, 2, 3, 2, 4, 1), 2))
}