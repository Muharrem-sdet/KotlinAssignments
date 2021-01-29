import java.lang.Integer.min
import kotlin.random.Random

/*
Task 4.1
It can be useful to know the weight of a book, for example, for shipping. The weight of a book can change
because sometimes pages get torn, and the page count changes.
While calculating the weight could be defined as a method, it’s more like a helper function.
Besides, it would hurt a book's feelings to have a method that tears up its pages.

Add a mutable property pages to Book.
Create an extension function on Book that returns the weight of a book as the page count multiplied by 1.5 grams.
Create another extension, tornPages(), that takes the number of torn pages as an argument and changes the page count of the book.
Write a class Puppy with a method playWithBook() that takes a book as an argument, and removes a random number of pages from the book.
Create a puppy and give it a book to play with, until there are no more pages.
Note: If you don’t want to give your puppy a book, then create a puzzle toy class and fill it with treats.
 */

class Puzzle{
    var piece: Int = 100
}

fun Puzzle.weight(): Double{
    return piece * 1.5
}

fun Puzzle.removePiece(piece:Int){
    this.piece -= piece
}

class Puppy {
    fun playWithPuzzle(puzzle: Puzzle){
        val pieceToRemove: Int = min(Random.nextInt(101), puzzle.piece)
        puzzle.removePiece(pieceToRemove)
    }
}

fun main() {
    val puzzle = Puzzle()
    val puppy = Puppy()
    while( puzzle.piece > 0){
        print("The puzzle had ${puzzle.piece} pieces and weights ${puzzle.weight()} grams. ")
        puppy.playWithPuzzle(puzzle)
        println("My puppy played with the puzzle. The puzzle has ${puzzle.piece} pieces and weights ${puzzle.weight()} grams now.")
    }
}