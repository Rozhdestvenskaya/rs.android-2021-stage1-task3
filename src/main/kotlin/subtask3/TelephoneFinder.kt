package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var result = ArrayList<String>()
        val plusOneArr = arrayOf(1, 2, 4, 5, 7, 8)
        val minusOneArr = arrayOf(2, 3, 5, 6, 8, 9)
        val plusThreeArr = arrayOf(1, 2, 3, 4, 5, 6)
        val minusThreeArr = arrayOf(4, 5, 6, 7, 8, 9)
        val minusEightArr = arrayOf(8)
        val plusEightArr = arrayOf(0)
        val regex = "[0-9]+".toRegex()
        if(number.matches(regex) && number.toInt() >= 0){
            for (i in number.indices){
                if(plusOneArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]+1).toString() + number.substring(i+1))
                if(minusOneArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]-1).toString() + number.substring(i+1))
                if(minusThreeArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]-3).toString() + number.substring(i+1))
                if(plusThreeArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]+3).toString() + number.substring(i+1))
                if(plusEightArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]+8).toString() + number.substring(i+1))
                if(minusEightArr.contains(number[i].toString().toInt()))
                    result?.add(number.substring(0, i) + (number[i]-8).toString() + number.substring(i+1))
            }
            return result?.toTypedArray()
        }
        return null
    }
}
