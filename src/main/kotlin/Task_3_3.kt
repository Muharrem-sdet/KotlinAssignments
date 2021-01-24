/*
Task 3.3
Let's talk about books for a moment, those heavy tomes of paper with printed letters.

1. Create a class, Book, with a title and an author.
2. Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
3. Create a subclass of Book; name it eBook.
4. eBook also takes in a format, which defaults to "text".
5. In eBooks, counting words makes more sense than pages.
   Override the readPage() method to increase the word count by 250, the average number of words per page from typewriter days.
 */

open class Book(title: String, author: String) {
    private var currentPage: Int = 0
    open fun readPage(){currentPage++}
}

class eBook(format:String = "text", title: String, author: String, ): Book(title, author){
    private var wordCount: Int = 0
    override fun readPage() {
        super.readPage()

        wordCount += 250
    }
}