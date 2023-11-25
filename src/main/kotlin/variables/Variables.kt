package variables

import java.util.BitSet

fun main(){
    val num: Int = 23
    val flt: Float = 23.3f
    val dobl: Double = 23.33
    val chr: Char = 'D'
    val strng: String = "David"
    val bt: Byte = 1

    println("The size of integer is: " + Integer.BYTES)
    println("The size of float is: " + java.lang.Float.BYTES)
    println("The size of double is: " + java.lang.Double.BYTES)
    println("The size of character is: " + java.lang.Character.BYTES)
    println("The size of string is: " + strng.length)
    println("The size of byte is: " + java.lang.Byte.BYTES)

}
