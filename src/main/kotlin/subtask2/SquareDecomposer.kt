package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val squareNumber = number * number
        val result = calculateTheSequence(squareNumber, number - 1)
        return when {
            result?.size == 1-> null
            else -> result?.toTypedArray()
        }
    }

    private fun calculateTheSequence(square: Int, num: Int): List<Int>? {
        for (i in num downTo 1) {
            val balance = square - i * i

            if (balance == 0) return listOf(i)
            else if (balance < 0) return null

            val next = sqrt(balance.toDouble()).toInt()
            var value: List<Int>? = emptyList()

            if (next >= i) value = calculateTheSequence(balance, i - 1)
            else value = calculateTheSequence(balance, next)

                if (value != null) {
                    return value + listOf(i)
                }
        }
        return null
    }
}