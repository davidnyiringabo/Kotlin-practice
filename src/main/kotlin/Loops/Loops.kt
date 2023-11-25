package Loops

fun mian(){
    println("Check")
}
val shopingList = listOf("Spagetti", "Mayonesse", "Chicken","Ugali", "Fries")
fun main(){

    println("On the menu, there is: ")
    for (i in shopingList){
        println(i)
    }

    // While loop
    var i=0
    while ( i< 2){
        println("How are you doing? ")
        i++
    }

    // Do While Loop

    do {
        println("This is a do while loop statement.")
    }
    while (i > 3 && i < 5)
}