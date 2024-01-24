import java.util.*

fun main() {
    var circle : Shape
    var square : Shape
    var triangle : Shape
    var input1 : String
    var input2 : String
    var input3 : String

    circle = Circle("circle")
    square = Square("square")
    triangle = Triangle("triangle")

    print("Enter radius of circle: ")
    input1 = readln()
    circle.setDimensions(input1.toDouble())
    print("Enter width of square: ")
    input1 = readln()
    print("Enter length of square: ")
    input2 = readln()
    square.setDimensions(input1.toDouble(), input2.toDouble())
    print("Is your triangle Equilateral? Y/N: ")
    input3 = readln()
    if (input3.uppercase() == "Y" || input3.uppercase() == "YES"){
        print("Enter side length: ")
        input1 = readln()
        triangle.setDimensions(input1.toDouble())
    } else {
        print("Enter side length 1: ")
        input1 = readln()
        print("Enter side length 2: ")
        input2 = readln()
        print("Enter side length 3: ")
        input3 = readln()
        triangle.setDimensions(input1.toDouble(), input2.toDouble(), input3.toDouble())
    }

    println("Your Circle: ")
    println("Name: ${circle.name}")
    circle.printDimensions()
    println("Your Square: ")
    println("Name: ${square.name}")
    square.printDimensions()
    println("Your Triangle: ")
    println("Name: ${triangle.name}")
    triangle.printDimensions()
}