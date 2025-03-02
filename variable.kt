/**
fun main() {
    val count: Int = 2
    println(count)
}

fun main() {
    val count: Int = 2
    println("You have $count unread messages.")
}

Note: If you don't provide an initial value when you declare a variable, you must specify the type.

In this line of code, no initial value is provided, so you must specify the data type:

val count: Int

In this line of code, an assigned value is provided, so you can omit the data type:

val count = 2
val count = 2

For a string template, you learned that you can put the $ symbol before a single variable name. 
However, if you have a more complex expression, you must enclose the expression in curly braces with the $ symbol before the curly braces: ${unreadCount + readCount}. 
The expression within the curly braces, unreadCount + readCount, evaluates to 105. Then the value 105 is substituted within the string literal.

fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun main() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

Notice the error says that the val can't be reassigned. 
The error is on the third line of the program, which tries to change the value of the cartTotal variable to 20. 
The val cartTotal can't be reassigned to another value (20) after it's been assigned an initial value (0).
*/
fun main() {
    val cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}
