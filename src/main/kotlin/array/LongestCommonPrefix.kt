package array

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = ""
        for (i in 0 until strs.minOf { it.length }) {
                if (strs.all { it[i] == strs[0][i] }) prefix += strs[0][i] else break
        }
        return prefix
    }
}

fun main() {
    val longestCommonPrefix = LongestCommonPrefix()
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("Flower", "Flamingo", "Flow")))
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("Flower", "Bee", "Car")))
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("Cast", "Cat", "Car")))
    println(longestCommonPrefix.longestCommonPrefix(arrayOf("Cir", "Car")))
}