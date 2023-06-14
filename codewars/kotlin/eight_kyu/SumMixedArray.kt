package eight_kyu

/**
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.
 */

fun sum(mixed: List<Any>): Int {
    return mixed.map {
        when (it) {
            is Number -> it.toInt()
            is String -> it.toInt()
            else -> throw IllegalArgumentException()
        }
    }.reduce { acc, any -> acc + any }
}
