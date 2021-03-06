/*
Task 4.2
One book is rarely alone, and one author rarely writes just one book.

Create a Set of book titles called allBooks, for example, by William Shakespeare.
Create a Map called library that associates the set of books, allBooks, to the author.
Use the collections function any() on library to see if any of the books are “Hamlet’
Create a MutableMap called moreBooks, and add one title/author to it.
Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
Hints:

any() is applied to a collection and takes a lambda as its argument, for example:
myList.any {it.contains(“name”)}
getOrPut() is a handy function that will check whether a key is in a map, and if it is, will return the value. Otherwise, it will add the key with the supplied value to the map.
mapOf() may come in handy.
 */

fun main() {
    val allBooksByShakespeare = setOf("Romeo and Juliet", "Hamlet", "Othello", "Macbeth", "King Lear", "A Midsummer Night's Dream")
    val library = mapOf("William Shakespeare" to allBooksByShakespeare)
    println(library.get("William Shakespeare")?.any { it.contains("Hamlet") })

    val moreBooks = mutableMapOf("Kasagi" to "Omer Seyfettin")
    println(moreBooks)
    moreBooks.getOrPut("Beyaz Lale", {"Omer Seyfettin"} )
    println(moreBooks)
}