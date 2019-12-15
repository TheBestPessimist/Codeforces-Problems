private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }


private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}


fun main() {
    val aaaaaaa = rdInts()
    val w = aaaaaaa[0]
    val s = aaaaaaa[1]
    val pumps = aaaaaaa[2]

    var p = rdInts()

    p = p.sorted()

    var min = Int.MAX_VALUE
    if(p.size - s == 0){
        println(p.sum())
        return
    }
    for (i in 0 until p.size - s) {
        val sl = p.subList(i, i + s).sum()
        min = Math.min(min, sl)
    }
    println(min)
}
