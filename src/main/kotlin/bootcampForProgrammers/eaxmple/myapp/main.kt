package bootcampForProgrammers.eaxmple.myapp

fun builtAquarium() {
    val myAquarium1 = Aquarium()
    myAquarium1.printSize()

    val myAquarium2 = Aquarium(35, 28, 100)
    myAquarium2.printSize()

    val myAquarium3 = Aquarium(height = 15)
    myAquarium3.printSize()

    val myAquarium4 = Aquarium(width = 50, length = 70, height = 25)
    myAquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

}

fun main(args: Array<String>) {
    builtAquarium()
}