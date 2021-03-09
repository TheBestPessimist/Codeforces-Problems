package contest

private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }

private fun testRdInts(s: String): List<Int> = s.split(" ").map { it.toInt() }

private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}
