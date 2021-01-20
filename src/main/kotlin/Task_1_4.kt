/*
Task 1.4  Null Checks
Create a nullable integer variable called nullTest, and set it to null.
Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
Hint: Use the Elvis operator.
 */
fun main() {
    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)

    nullTest = 5
    println(nullTest?.inc() ?: 0)
}