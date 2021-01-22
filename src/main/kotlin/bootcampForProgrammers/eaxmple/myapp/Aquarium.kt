package bootcampForProgrammers.eaxmple.myapp

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {

    var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (length * width)
        }

    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm, Height: $height cm, Length: $length cm")
        println("Volume: $volume lt")
    }
}