/*
Task 1.5
Create three String variables for trout, haddock, and snapper.
Use a String template to print whether you do or don't like to eat these kinds of fish.
 */

fun main() {
    val fish1 = "trout"
    val fish2 = "haddock"
    val fish3 = "snapper"
    println("I liketo eat $fish1 and $fish2 but I do not like to eat $fish3")

    val fishes = listOf("trout", "haddock", "snapper")
    println("I liketo eat ${fishes[0]} and ${fishes[1]} but I do not like to eat ${fishes[2]}")
}