package saturdayProject_6
/*
    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values.

    for Example:
    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true
     */

fun threeEvenOdd(intArray: IntArray): Boolean {
    var evenCounter: Int = 0
    var oddCounter: Int = 0

    intArray.filter { it % 2 == 0 }.forEach { evenCounter = evenCounter.inc() }
    intArray.filter { it % 2 != 0 }.forEach { oddCounter = oddCounter.inc() }

    return (evenCounter == 3 || oddCounter == 3)

}

fun main(args: Array<String>) {
    val intArray1: IntArray = intArrayOf(2, 1, 3, 5)
    val intArray2: IntArray = intArrayOf(2, 1, 2, 5)
    val intArray3: IntArray = intArrayOf(2, 4, 2, 5)
    println(threeEvenOdd(intArray = intArray1))
    println(threeEvenOdd(intArray = intArray2))
    println(threeEvenOdd(intArray = intArray3))
}