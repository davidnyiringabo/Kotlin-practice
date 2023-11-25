package Operators

fun main(){
    var num1 = readLine() ?: "0"
    val num2 = readLine() ?: "0"

    val sum = num1.toInt() + num2.toInt();
    println("The sum of the numbers is: " + sum)
}