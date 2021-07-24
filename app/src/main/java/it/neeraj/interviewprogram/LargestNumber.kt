package it.neeraj.interviewprogram

import java.util.*
import kotlin.math.min

fun main() {
    val n = findNLargestNumber(arrayOf(1, -2, 3, 3, 5), n = 5, isDuplicateCheck = true)
    if (n == -1) println("output -1") else println("output $n")
}

fun findSecondLargestNumber(array: Array<Int>): Int {
    val size = array.size
    if (array.size < 2)
        return -1
    Arrays.sort(array)
    return array[size - 1].coerceAtMost(array[size - 2])
}

/**
 * if all are unique number in array
 */
fun findNLargestNumber(array: Array<Int>, n: Int): Int {
    val size = array.size
    val list = array.toSet()
    println(list.toString())
    return when {
        size < n -> -1
        size == 1 && n == 1 -> array[0]
        size == 2 && n == 2 -> min(array[0], array[1])
        else -> {
            Arrays.sort(array)
            array[size - n]
        }
    }
}

fun findNLargestNumber(array: Array<Int>, n: Int, isDuplicateCheck: Boolean = false): Int {
    var newArray = array
    if (isDuplicateCheck)
        newArray = array.toSet().toTypedArray()

    val size = newArray.size

    return when {
        size < n -> -1
        size == 1 && n == 1 -> newArray[0]
        size == 2 && n == 2 -> min(newArray[0], newArray[1])
        else -> {
            Arrays.sort(newArray)
            newArray[size - n]
        }
    }
}


