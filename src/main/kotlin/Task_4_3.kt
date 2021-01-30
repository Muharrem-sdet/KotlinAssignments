/*
Task 4.3
1 - Create a top-level constant for the maximum number of books a person could borrow.
2 - Inside the Book class, create a method canBorrow() that returns true or false depending on
    whether a user has already borrowed the max number of books.
3 - Create a Constants object that provides constants to the book.
    For this example, provide the BASE_URL for all books in the library catalog.
    Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL, the book title, and “.html”.
4 - The base URL is really of interest to the Book class.
    As such, it makes sense to limit its scope to the Book class.
    Use a companion object to define the constant in Book.
 */



class User {
    companion object {
        const val MAX_NUMBER_OF_BOOKS_USER_CAN_BORROW: Int = 20
    }

    var numberOfBooksBorrowed: Int = 0

    fun canBorrow(): Boolean {
        return numberOfBooksBorrowed < MAX_NUMBER_OF_BOOKS_USER_CAN_BORROW
    }

    fun borrow(): Boolean{
        if (canBorrow()){
            numberOfBooksBorrowed++
            println("Book is successfully borrowed.")
            return true
        }
        else{
            println("You have already reach your limit for borrowing.")
            return false
        }
    }
}

class HardBook(val title: String) {  // I used HardBook name in order not to conflict with other Book class in the project

    companion object {
        const val BASE_URL: String = "https://mylibrary.com/catalog/hardbooks/"
    }

    fun createUrl(): String {
        return BASE_URL + title.filter { it in '0'..'9' || it in 'A'..'z'} + ".html"
    }

    fun printUrl() {
        println(createUrl())
    }
}

fun main() {
    val book = HardBook("Romeo and Juliet")
    val user = User()
    user.borrow()
    book.printUrl()
}