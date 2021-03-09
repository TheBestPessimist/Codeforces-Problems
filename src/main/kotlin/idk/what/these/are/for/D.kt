private fun rdLn(): String = readLine()!!
private fun rdInt(): Int = rdLn().toInt()
private fun rdInts(): List<Int> = rdLn().split(" ").map { it.toInt() }


private fun String.toListOfString(): List<String> {
    return this.toList().map { it.toString() }
}


fun main() {
    rdLn()
    val ints = rdInts()
    val noLists = ints.count { it == -1 }
    val lists = mutableListOf<MutableList<Int>>()
    for (i in 0 until noLists) {
        lists.add(mutableListOf())
    }

    var curList = 0
    for (i in ints) {
        while (lists[curList].isNotEmpty() && lists[curList].last() == -1) {
            curList++
            curList %= noLists
        }
        lists[curList++].add(i)
        curList = curList.rem(noLists)
    }

//    println(lists)

    println(noLists)
    for (l in lists) {
        println("${l.size - 1} ${l.dropLast(1).joinToString(" ")}")
    }
//    println(lists)
}
