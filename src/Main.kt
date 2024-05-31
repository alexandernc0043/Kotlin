fun main() {
    println("Hello World!")
    sum(1,2)
    printSum(1,2)
    val oneByTwo = Shape(1.0,2.0)
    println("The perimeter is ${oneByTwo.perimeter}")
    val square = Square(2.0,2.0)
    println("The area of the square is ${square.area}")
    val name: String = "Alex"
    println("My name is $name!")
}
fun sum(a: Int, b: Int){
    println(a+b)
}
fun printSum(a: Int, b: Int) {
    println("The Sum of $a and $b is ${a+b}")
}
class Shape(val height: Double, val length: Double){
    val perimeter = (height + length) * 2
}
class Square constructor(val sideOne: Double, val sideTwo: Double){
    val area = (sideOne * sideTwo)
}