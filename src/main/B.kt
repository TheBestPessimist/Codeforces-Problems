private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }


private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}


fun main() {
    rdLn()

    val cache = mutableMapOf<Int, Boolean>()


    var days = rdInts()

    var sorted = mutableListOf<Int>(days[0])

    var count = 0
    for (i in 2 until days.size) {
        if (cache.containsKey(days[i])) {
            count++
            continue
        }


        sorted.add(days[i - 1])
        sorted.sort()


        var pos = 0
        for (j in sorted.size - 1 downTo 0) {
            if (sorted[j] <= days[i]) {
                break
            }
            if (sorted[j] > days[i]) {
                pos++
            }
            if (pos >= 2) {
                count++
                cache[days[i]] = true
                break
            }
        }
    }
    println(count)
}
