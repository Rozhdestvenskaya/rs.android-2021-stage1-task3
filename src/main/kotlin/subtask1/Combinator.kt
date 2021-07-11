package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var numberOfCombinations: Long = array[0].toLong() //6
        val setOfElements = array[1] //4
        var x = 0
        if(setOfElements > 0 && array[0] >= 0){
            for (i in  1..array[1]){
                x = i
                numberOfCombinations = factorial(setOfElements) / (factorial(x) * factorial(setOfElements - x))
                if(numberOfCombinations == array[0].toLong()) return x
            }
        }
        return null
    }

    fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)
}
