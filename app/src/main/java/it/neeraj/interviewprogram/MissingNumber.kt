package it.neeraj.interviewprogram

import java.util.*

fun main() {
    val num = missingNumberInSeries(
        arrayOf(2, 2, 3, 4, 3, 4, 1, 9, 5, 6, 11, 7, 8),
        isDuplicateCheck = true
    )

    println("output $num")
}

fun missingNumberInSeries(array: Array<Int>, isDuplicateCheck: Boolean = false): Int? {
    var missingNumber: Int? = null

    var newArray = array
    if (isDuplicateCheck) {
        newArray = array.toSet().toTypedArray()
    }

    Arrays.sort(newArray)
    println("${newArray.toList()}")
    var number = newArray[0]
    run breakLoop@{
        newArray.forEach {
            println("before number $number it $it")
            if (number != it) {
                missingNumber = number
                return@breakLoop
            }
            number++
            println("after number $number")
        }
    }
    return missingNumber
}
