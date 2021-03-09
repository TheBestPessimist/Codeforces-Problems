private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }


private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}


fun main() {
    repeat(rdInt()) {
        val s1 = rdLn().toListOfString().toMutableList()
        val s2 = rdLn().toListOfString()

        calc(s2, s1)
    }
}

private fun calc(s2: List<String>, s1: MutableList<String>) {
    for (i in 0 until s2.size) {
        if (s1.size <= i) {
            println("NO")
            return
        }
        if (s1[i] == s2[i]) {
            continue
        }

        if (s2[i] == "-") {
            println("NO")
            return
        }

        if (s2[i] == "+" && s1.size >= i + 2) {
            if (s1[i] == s1[i + 1] && s1[i] == "-") {
                s1[i] = "+"
                s1.removeAt(i + 1)
            }
        }
    }
    if (s1 == s2) {
        println("YES")
    } else {
        println("NO")
    }
}
