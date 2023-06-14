package six_kyu

import kotlin.math.max

/**
Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime. (This rules out primes which are palindromes.)

Examples:
13 17 31 37 71 73 are Backwards Read Primes

13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.
Task

Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one always being greater than or equal to the first one. The resulting array or the resulting string will be ordered following the natural order of the prime numbers.
Examples (in general form):

backwardsPrime(2, 100) => [13, 17, 31, 37, 71, 73, 79, 97] backwardsPrime(9900, 10000) => [9923, 9931, 9941, 9967] backwardsPrime(501, 599) => []

See "Sample Tests" for your language.
Notes

Forth Return only the first backwards-read prime between start and end or 0 if you don't find any
Ruby Don't use Ruby Prime class, it's disabled.

 */


private const val maxAttemptsToDivide = 10000L

fun backwardsPrime(start: Long, end: Long): String {

    val backwardsPrimeList = mutableListOf<Long>()

    for (number in start..end step 1) {

        val characters = number.toString().mapTo(HashSet()) { it }

        if (characters.size == 1) continue

        if (!isPrime(number)) continue

        val invertedNumber = number.toString().reversed().toLong()

        if (invertedNumber == number) continue

        if (isPrime(invertedNumber))
            backwardsPrimeList.add(number)

    }

    return backwardsPrimeList.joinToString(" ") { it.toString() }
}

fun isPrime(numberToCheck: Long): Boolean {

    var currentDivisor = 2L
    var isPrime = true
    val maxAttempts = if(numberToCheck < maxAttemptsToDivide) numberToCheck else maxAttemptsToDivide

    while (currentDivisor != maxAttempts) {
        if (numberToCheck.mod(currentDivisor) != 0L) ++currentDivisor
        else { isPrime = false; break }
    }

    return isPrime
}

fun main() {
    println(backwardsPrime(1095047, 1095403))
}
