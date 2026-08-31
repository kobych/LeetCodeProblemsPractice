package string

class RomanToInt() {
    fun romanToInt(s: String): Int {
        val romanNumbers = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var num = 0

        s.forEachIndexed { index, it ->
            if (index + 1 < s.length) {
                if ((romanNumbers[s[index]] ?: 0) >= (romanNumbers[s[index + 1]] ?: 0)) num += romanNumbers[it]
                    ?: 0 else num -= romanNumbers[it] ?: 0
            } else num += romanNumbers[it] ?: 0
        }

        return num
    }
}

fun main() {
    val romanToInt = RomanToInt()
    println(romanToInt.romanToInt("III"))
}
