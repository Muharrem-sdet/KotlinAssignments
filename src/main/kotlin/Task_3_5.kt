/*
Task 3.5
Create a simple data class, SpiceContainer, that holds one spice.
Give SpiceContainer a property, label, that is derived from the name of the spice.
Create some containers with spices and print out their labels.
 */

data class SpiceContainer(val spice: Spice){
    val label: String = spice.name
}

fun main() {
    val saffron = Spice("saffron", "not spicy")
    val ginger = Spice("ginger")
    val paprika = Spice("paprika", "chilly")

    val saffronContainer = SpiceContainer(saffron)
    println(saffronContainer.label)

    val gingerContainer = SpiceContainer(ginger)
    println(gingerContainer.label)

    val paprikaContainer = SpiceContainer(paprika)
    println(paprikaContainer.label)
}