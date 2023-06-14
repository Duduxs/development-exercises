package five_kyu

/**
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.

Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.


 */

fun incrementString(str: String): String {

    val lastChar = str.toCharArray().lastOrNull()

    if (lastChar == null || Character.isAlphabetic(lastChar.code)) return str + "1"

    val hasNoLettersInString = str.indexOfFirst { it.isLetter() } == -1
    val stringLastLetterIndex = str.indexOfLast { it.isLetter() } + 1

    val strWithOnlyNumbers = when {
        hasNoLettersInString -> str
        else -> str.substring(stringLastLetterIndex)
    }

    val strWithOnlyNumbersLength = strWithOnlyNumbers.length
    val incrementedNumber = strWithOnlyNumbers.toInt().inc()
    val zeros = (1..strWithOnlyNumbersLength - incrementedNumber.toString().length).joinToString("") { "0" }

    return str.substring(0, stringLastLetterIndex) + zeros + incrementedNumber
}

fun main() {
    println(incrementString("0"))
    println(incrementString("1"))
    println(incrementString("oi"))
    println(incrementString("ola000999"))
    println(incrementString("foobar00999"))
    println(incrementString(""))
    println(incrementString("99obar99"))
    println(incrementString("foo99obar99"))
    println(incrementString("doo99foo99obar99"))
    println(incrementString("0foo99obar99"))
    println(incrementString("1foo99obar99"))
}