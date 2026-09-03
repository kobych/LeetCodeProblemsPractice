package array

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var position = 0 // Index where we can put target

        /*
        If target bigger than current element
        we need to increment position
        so target can be inserted in right order
        */
        for (i in 0 until nums.size) {
            if (nums[i] < target) {
                position++
            }
        }
        return position
    }
}

fun main() {
    val searchInsertPosition = SearchInsertPosition()
    println(searchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 2))
}