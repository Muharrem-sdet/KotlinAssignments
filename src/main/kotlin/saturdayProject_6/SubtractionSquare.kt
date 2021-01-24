package saturdayProject_6
/*
   Given one method name is substSquare
   This method get two ints as parameter
   return type is int
   Get square of the sum of the numbers using getSumOfSquares(scroll down to see explanation) method ,
   Parameter 1 square of the sum + Parameter 2 square of the sum  = your result
   for example:
   int 1 = 10
   int 2 = 5;
   3025 + 225 = 3250
   return 3250
    */
fun sumOfTheSquares(num1: Int, num2: Int): Int {
    return squareOfTheSum(num1) + squareOfTheSum(num2)
}

/*
Create one method name is getSumOfSquares
This method get one int as parameter
Return type is int
Get the square of the sum of the numbers
for example:
int is 10
 (1+2+...+10)²=55²=3025
 return 3025
 */
fun squareOfTheSum(num: Int): Int {
    var result: Int = 0
    for (i in 1..num) {
        result += i
    }
    return result * result
}

fun main() {
    println(sumOfTheSquares(10, 5))
}