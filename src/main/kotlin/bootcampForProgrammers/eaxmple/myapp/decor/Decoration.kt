package bootcampForProgrammers.eaxmple.myapp.decor

data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
}

fun main() {
//    makeDecorations()
    useDestructuring()
}

data class Decoration2(val rock: String, val wood: String, val diver: String)

fun useDestructuring() {
    val decor = Decoration2("crystal", "wood", "diver")
    println(decor)

    val (rock, wood, diver) = decor
    println(rock)
    println(wood)
    println(diver)
}