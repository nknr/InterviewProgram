package it.neeraj.interviewprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import java.util.*
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numArray = arrayOf(1, 2, 4, 7, 9, 2)
        findSecondLargestNumber(arrayOf(1, 2, 4, 7, 9, 2))
    }

    /*private fun findSecondLargestNumber(array: Array<Int>):Int{
         if (array.size <2)
             return -1
         Arrays.sort(array)
         println(array.toString())
        array.forEach {
            println("v $it ")
        }
         return 1;
     }*/

    private fun findSecondLargestNumber(array: Array<Int>): Int {
        val size = array.size
        return when {
            size < 2 -> -1
            array.size == 2 -> {
                min(array[0], array[1])
            }
            else -> {
                Arrays.sort(array)
                min(array[0], array[1])
            }
        }
    }


}