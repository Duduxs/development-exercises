package six_kyu

/**
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"

 */

fun toCamelCase(str: String): String {
    val newStr = str.split("_", "-")
    return newStr
        .joinToString("") { e -> if(newStr.indexOf(e) == 0) e else e.replaceFirstChar { it.uppercase() } }
}

fun main() {
    println(toCamelCase("the-stealth-warrior"))
}
