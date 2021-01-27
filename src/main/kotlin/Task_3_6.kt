/*
Task 3.6
In SpiceColor, change the type of color from String to the Color class, and set the appropriate color in YellowSpiceColor.
Hint: The color code for yellow is YELLOW(0xFFFF00)

Make Spice a sealed class.
What is the effect of doing this?
Why is this useful?
 */

// I have changed the SpiceColor from String to Color enum in the file Task_3_4 and done necessary amendments in the file

// I have changed abstract class Spice to a sealed class Spice, so that I make sure all the subclasses of Spice are within the Spice class
// and I prevent Spice classes to be extended from outside of the class.