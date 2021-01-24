package saturdayProject_6
/*
   First letter to upper case
    parameter is one String
    return type is String
    words are delimited by a space.
    All the words first letter should be camel case

   For Example:
        my family live in united states
  Result should be
        My Family Live In United States
 */

fun camelCase(sentence: String): String {
    var result: String = ""
    sentence.split(" ").forEach {
        result = result.plus(it.substring(0, 1).toUpperCase())
            .plus(it.substring(1))
            .plus(" ") }
    return result
}

fun main(args: Array<String>) {
    val sentence = "my family live in united states"
    println(camelCase(sentence))
}