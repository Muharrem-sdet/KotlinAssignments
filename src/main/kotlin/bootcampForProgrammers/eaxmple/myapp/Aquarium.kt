package bootcampForProgrammers.eaxmple.myapp

import java.lang.Math.PI

open class Aquarium(var width: Int = 20, open var height: Int = 40, var length: Int = 100) {

    open var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (length * width)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = 0.9 * volume


    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm, Height: $height cm, Length: $length cm")
        println("Volume: $volume lt, Water: $water lt (${water/volume*100.0}% full)")
    }
}

class TowerTank(override var height: Int, val diameter: Int) :
    Aquarium(length = diameter, width = diameter, height = height) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}