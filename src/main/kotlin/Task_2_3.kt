/*
Task 2.3
Create a program that suggests an activity based on various parameters.

Start in a new file with a main function.
From main(), create a function, whatShouldIDoToday().
Let the function have three parameters.
mood: a required string parameter
weather: a string parameter that defaults to "sunny"
temperature: an Integer parameter that defaults to 24 (Celsius).
Use a when construct to return some activities based on combinations of conditions. For example:
mood == "happy" && weather == "Sunny" -> "go for a walk"
else -> "Stay home and read."
Call it with combinations of arguments. For example:
whatShouldIDoToday("sad")
> Stay home and read.
 */
fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("unhappy", "cold"))
    println(whatShouldIDoToday("happy", temperature = 12))
    println(whatShouldIDoToday("superb", temperature = 35, weather = "sunny"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    val goodMoods = listOf("happy", "fantastic", "superb")
    val badMoods = listOf("sad", "unhappy", "angry")
    val goodWeather = listOf("sunny", "cloudy", "warm")
    val badWeather = listOf("rainy", "cold", "stormy")

    return when {
        mood in goodMoods && weather in goodWeather && temperature in 15..20 -> "Go for a walk"
        mood in goodMoods && weather in badWeather && temperature in 0..10 -> "Watch a movie at home"
        mood in badMoods && weather in badWeather && temperature in -5..5 -> "Light the fireplace"
        mood in badMoods && weather in goodWeather && temperature in 20..30 -> "Take your dog for walking"
        mood in goodMoods && weather in goodWeather && temperature in 35..45 -> "Go for swimming"
        else -> "Stay home and read"
    }

}