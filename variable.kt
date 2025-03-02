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
*/
fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}
