/**
 * Created by TCA on 28-05-2017.
 */
package  kotlintest

fun main (args : Array<String>){
    //Immutable
    val name = "Arun";
    //Mutable
    var message = "Hi"
    println(message + " " + name)

    message = "Hello"
    println(message + " " + name)

}