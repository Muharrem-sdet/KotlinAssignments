/*
Task 1.3  Nullability/Lists
Create a list with two elements that are null; do it in two different ways.
Next, create a list where the list is null.
 */

fun main() {
// First way:
    var myList: List<String?> = listOf(null, null)
    var myList2 = listOf<String?>(null, null)

    println(myList)
    println(myList2)

    var myNullList: List<String>? = null
    println(myNullList)
}