fun main() {
    print(solution(mutableListOf(24, 85, 0)))
}

fun solution(a: MutableList<Int>): Int {
    var binaryString = ""
    for (i in a.size - 1 downTo 0) {
        binaryString += Integer.toBinaryString(a[i]).padStart(8, '0')
    }
    return Integer.parseInt(binaryString, 2)
}
