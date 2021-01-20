/*
Task 1.6
when statements in Kotlin are like case or switch statements in other languages.
Create a when statement with three comparisons:
If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it is anything else, print "OK fish name".
 */

fun main() {
  fishMessenger(0)
  fishMessenger(8)
  fishMessenger(15)
}

fun fishMessenger(fishLength:Int) = println(
    when (fishLength) {
        0 -> "Fish length cannot be 0."
        in 3..12 -> "Good fish name"
        else -> "OK fish name"
    }
)