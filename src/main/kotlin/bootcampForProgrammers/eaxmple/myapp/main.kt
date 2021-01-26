package bootcampForProgrammers.eaxmple.myapp

fun builtAquarium() {
    val myAquarium = Aquarium(length = 25, width = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main(args: Array<String>) {
//    builtAquarium()
    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Pleco: ${pleco.color}")
    pleco.eat()
}