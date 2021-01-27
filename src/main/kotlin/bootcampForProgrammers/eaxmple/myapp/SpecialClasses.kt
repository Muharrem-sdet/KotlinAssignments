package bootcampForProgrammers.eaxmple.myapp

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

enum class Directions(val degrees: Int){
    EAST(0), NORTH(90), WEST(180), SOUTH(270)
}

fun main() {
    println(Directions.NORTH.name)
    println(Directions.NORTH.ordinal)
    println(Directions.NORTH.degrees)
}

