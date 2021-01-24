package saturdayProject_6
/*
    Update a method uRange
    parameters are int array and two ints
    if the int array has a number between the two ints change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    result should be 1,6,-1,-1,22,-1,30,-1
*/

fun updateArray(array: IntArray, int1: Int, int2: Int): IntArray {
    for (i in array.indices) if (array[i] in 10..20) array[i] = -1
    return array
}

fun main(args: Array<String>) {
    val array = intArrayOf(1, 6, 12, 15, 22, 18, 30, 16)
    updateArray(array, 10, 20).forEach { print("$it, ") }

}