package leetcode.kotlin.easy

fun twoSum(nums: IntArray, target: Int): IntArray {

    val filteredData = nums
        .filter { it < target }
        .toMutableList()

    val result: IntArray

    do {

        if (filteredData.first() + filteredData.last() != target) {
            filteredData.removeLast()
        } else {
            result = intArrayOf(filteredData.indexOf(filteredData.first()), filteredData.lastIndexOf(filteredData.last()))
            break
        }

    } while (true)


    return result

}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(twoSum(intArrayOf(3, 2, 4), 6).contentToString())
    println(twoSum(intArrayOf(3, 3), 6).contentToString())
}