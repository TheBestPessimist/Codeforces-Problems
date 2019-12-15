private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }


private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}


fun main() {
    repeat(rdInt()) {
        val ints = rdInts().sorted()
        val a = 1
        val b = ints[0] - a
        val c = ints[1] - b
        println("$a $b $c")

    }
}
