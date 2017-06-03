/**
 * Created by TCA on 28-05-2017.
 */
package  kotlintest

fun main (args : Array<String>) {

    //No Semi colons
    //Immutable
    val name = "Sara"
    //Mutable
    var message = "Hi"
    println(message + " " + name)

    message = "Hello"
    println(message + " " + name)

    //String Interpolation
    println("$message $name")

    //TypeInference + Int
    var maxInt = Int.MAX_VALUE
    var minInt = Int.MIN_VALUE

    println("maxInt $maxInt")
    println("minInt $minInt")

    //TypeInference + Short
    var maxShort = Short.MAX_VALUE
    var minShort = Short.MIN_VALUE

    println("maxShort $maxShort")
    println("minShort $minShort")

    //TypeInference + Long
    var maxLong = Long.MAX_VALUE
    var minLong = Long.MIN_VALUE

    println("maxLong $maxLong")
    println("minLong $minLong")


    //TypeInference + Double
    var maxDouble = Double.MAX_VALUE
    var minDouble = Double.MIN_VALUE

    println("maxDouble $maxDouble")
    println("minDouble $minDouble")


    //TypeInference + Float
    var maxFloat = Float.MAX_VALUE
    var minFloat = Float.MIN_VALUE

    println("maxFloat $maxFloat")
    println("minFloat $minFloat")


    //Char and Boolean
    val charA: Char = 'Z'
    //is and !is Operators for Type Checks
    println("$charA is a Char ${charA is Char}")

    //Smart Type Checks
    val someString = "Sample String"
    if (someString is String) {
        println("Length is " + someString.length) // someString is automatically cast to String
    }

    //Type conversion
    var numberTest:Number = 50
    println("Number 50 to Char " + numberTest.toChar())

    println("Char A to number " + ('A'.toInt()))

    var bolVal:Boolean = true
    println("Boolean true to String " + bolVal.toString())






    println("The End")
}