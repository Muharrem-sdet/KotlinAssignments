/*
Task 3.2
Let's improve our SimpleSpice class so that we can have various spices with different levels of spiciness.

Create a new class, Spice.
Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
Add an init block that prints out the values for the object after it has been created. Create a spice.
Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
Because salt is a very common spice, create a helper function called makeSalt().
 */

class Spice(val name: String, val levelOfSpiciness: String = "mild") {
    val heat: Int
        get() = when (levelOfSpiciness) {
            "chilly" -> 5
            "very spicy" -> 4
            "spicy" -> 3
            "mild" -> 2
            "not spicy" -> 1
            else -> 0
        }

    init {
        println("Name: $name | Level of Spiciness: $levelOfSpiciness | Heat: $heat")
    }

}

fun main(args: Array<String>) {
    val spice1 = Spice("burning tasty", "chilly")
    val spice2 = Spice("sweet spicy", "not spicy")
    val spice3 = Spice("sweating spicy", "very spicy")
    val spice4 = Spice("middle spice", "mild")
    val spice5 = Spice("african fire", "chilly")
    val spice6 = Spice("delicious spice", "spicy")
    val spice7 = Spice("spice for all", "mild")
    val spice8 = Spice("tasty spicy", "spicy")

    val allSpiceList: List<Spice> = listOf(spice1, spice2, spice3, spice4, spice5, spice6, spice7, spice8)
    val spicyOrLessList: List<Spice> = allSpiceList.filter { it.heat <= 3 }

    print("List of spicy or less: ")
    spicyOrLessList.forEach { print("${it.name}, ")}
    println()
    makeSalt()
}

fun makeSalt() = Spice("salt", "not spicy")