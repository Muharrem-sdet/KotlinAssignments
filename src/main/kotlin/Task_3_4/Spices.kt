package Task_3_4

/*
Task 3.4 Abstract and Interface
Let's go back to your spices. Make Spice an abstract class, and then create some subclasses that are actual spices.

It's easiest (organizationally) if you make a new package, Spices, with a file, Spice, that has a main() function.
Copy/paste your Spice class code into that new file.
Make Spice abstract.
Create a subclass, Curry. Curry can have varying levels of spiciness, so we don't want to use the default value, but rather pass in the spiciness value.
Spices are processed in different ways before they can be used. Add an abstract method prepareSpice to Spice, and implement it in Curry.
Curry is ground into a powder, so let's call a method grind().
However, grinding is something that's not unique to curry, or even to spices, and it's always done in a grinder.
So we can create an Interface, Grinder, that implements the grind() method. Do that now.
Then add the Grinder interface to the Curry class.
 */

abstract class Spice(val name: String, val levelOfSpiciness: String = "mild") {
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

    abstract fun prepareSpice()

}

class Curry(name: String = "curry", val spiciness: String) :
    Spice(name, spiciness), Grinder,
    SpiceColor by yellowSpiceColor {

    override fun prepareSpice() {
        println("I am preparing curry.")
    }

    override fun grind() {
        println("I am grinding curry.")
    }

}

interface Grinder {
    fun grind()
}

/*
Delegation (Optional)
Using the provided code from the lesson for guidance, add a yellow color to Curry.
1- Create an interface, SpiceColor, that has a color property. You can use a String for the color.
2- Create a singleton subclass, YellowSpiceColor, using the object keyword,
  because all instances of Curry and other spices can use the same YellowSpiceColor instance.
3- Add a color property to Curry of type SpiceColor, and set the default value to YellowSpiceColor.
4- Add SpiceColor as an interface, and let it be by color.
5- Create an instance of Curry, and print its color.
  However, color is actually a property common to all spices, so you can move it to the parent class.
6- Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.
 */

interface SpiceColor {
    val color: String
}

object yellowSpiceColor : SpiceColor {
    override val color: String = "yellow"
}

fun main() {
    val curry = Curry(spiciness = "mild")
    println("Color of ${curry.name} is ${curry.color}.")
}