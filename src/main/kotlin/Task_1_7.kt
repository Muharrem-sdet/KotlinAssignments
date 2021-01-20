/*
Task 1.7
Basic example
Create an integer array of numbers called numbers, from 11 to 15.
Create an empty mutable list for Strings.
Write a for loop that loops over the array and adds the string representation of each number to the list.

Challenge example
How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?
 */
fun main() {
    ////////// Basic Example ////////////

    val numbers = intArrayOf(11, 12, 13, 14, 15)
    var myStringNumbers = mutableListOf<String>()

    for (number in numbers) {
        myStringNumbers.add(number.toString())
    }

    println(myStringNumbers)


    ////////// Challenge Example ///////////////
    // First way:
    var multiplesOf7 = mutableListOf<Int>()
    for (num in 0..100) {
        if (num % 7 == 0)
            multiplesOf7.add(num)
    }
    println(multiplesOf7)

    // Second way:
    multiplesOf7.clear()
    for (num in 0..100 step 7) {
        multiplesOf7.add(num)
    }
    println(multiplesOf7)

    // Third way:
    multiplesOf7.clear()
    for (num in 0 until 100 / 7 + 1) {
        multiplesOf7.add(num * 7)
    }
    println(multiplesOf7)

    // Fourth way:
    multiplesOf7.clear()
    val range: IntRange = 0..100/7
    for (num in range) {
        multiplesOf7.add(num * 7)
    }
    println(multiplesOf7)
}