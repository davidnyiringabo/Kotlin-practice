import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    var name = "David NYIRINGABO"
    println(name)
    var fl:Float = 23.3f
    var doub:Double = 23.3
    val product = fl * doub
    println(product)
    println("Enter the first number: ")
    var num1 = readLine() ?: "0"
    println("Enter the second number: ")
    var num2 = readLine() ?: "0"
    val sum = num1.toInt() + num2.toInt()
    println("The sum of "+ num1 + " and "+num2+ " is "+ sum)
}