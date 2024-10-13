import kotlin.math.*

fun main()
{
    println(1 shl 3)
    println(1 shr 3)
    println(32 shr 2)
    println(32 shl 2)

//    Order function
    println(((8000 / (5 * 10)) - 32) shr (29 % 5))
    println(((8000 / (5 * 10)) - 32) shl (29 % 5))
    println(350 / 5 + 2)
    println(350 / (5 + 2))

//    Math function
    println(sin(45 * PI / 180))
    println(cos(45 * PI / 180))
    println(sqrt(4.0))
    println(max(5, 10))
    println(min(-5, -10))
    println(max(sqrt(4.0), PI / 2))

//    Variable
    val number: Int = 10
    val pi: Double = 3.14
    var x: Int = 42
    println(x)
    x = 1
    println(x)
    println(number)

//    Increment & Decrement
    var counter: Int = 0
    counter++
    println(counter)

//    Constant
}

const val reallyConstant: Int = 42