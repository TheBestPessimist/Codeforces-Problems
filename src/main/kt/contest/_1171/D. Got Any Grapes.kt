package kt.contest._1171

import kt.rdInts


/**
 *
 * https://codeforces.com/contest/1171/problem/D
 *
[]The Duck song](https://www.youtube.com/watch?v=MtN1YnoL46Q)
For simplicity, we'll assume that there are only three types of grapes: green grapes, purple grapes and black grapes.

Andrew, Dmitry and Michal are all grapes' lovers, however their preferences of grapes are different. To make all of them happy, the following should happen:

Andrew, Dmitry and Michal should eat at least x, y and z grapes, respectively.
Andrew has an extreme affinity for green grapes, thus he will eat green grapes and green grapes only.
On the other hand, Dmitry is not a fan of black grapes — any types of grapes except black would do for him. In other words, Dmitry can eat green and purple grapes.
Michal has a common taste — he enjoys grapes in general and will be pleased with any types of grapes, as long as the quantity is sufficient.
Knowing that his friends are so fond of grapes, Aki decided to host a grape party with them. He has prepared a box with a green grapes, b purple grapes and c black grapes.

However, Aki isn't sure if the box he prepared contains enough grapes to make everyone happy. Can you please find out whether it's possible to distribute grapes so that everyone is happy or Aki has to buy some more grapes?

It is not required to distribute all the grapes, so it's possible that some of them will remain unused.

Input
The first line contains three integers x, y and z (1≤x,y,z≤105) — the number of grapes Andrew, Dmitry and Michal want to eat.

The second line contains three integers a, b, c (1≤a,b,c≤105) — the number of green, purple and black grapes in the box.

Output
If there is a grape distribution that allows everyone to be happy, print "YES", otherwise print "NO".

Examples
input
1 6 2
4 3 3
output
YES

input
5 1 1
4 3 2
output
NO

Note
In the first example, there is only one possible distribution:

Andrew should take 1 green grape, Dmitry should take 3 remaining green grapes and 3 purple grapes, and Michal will take 2 out of 3 available black grapes.

In the second test, there is no possible distribution, since Andrew is not be able to eat enough green grapes. :(
 */
//enum class Grapes {
//    GREEN,
//    PURPLE,
//    BLACK,
//}
//
//data class GrapeQuantity(val grapes: Grapes, val qty: Int)
//
//data class Dood(val minGrapes: Int, val likes: List<Grapes>, val yikes: List<Grapes>)
//
//
//private fun rdLn(): String = readLine()!!
//private fun readInts() = rdLn().split(" ").map { it -> it.toInt() }
//
//fun main() {
//    val s = readInts()
//    val x = s[0]
//    val y = s[1]
//    val z = s[2]
//
//    val Andrew = Dood(x,
//            listOf(Grapes.GREEN),
//            listOf(Grapes.PURPLE, Grapes.BLACK))
//    val Dmitry = Dood(y,
//            listOf(Grapes.GREEN, Grapes.PURPLE),
//            listOf(Grapes.BLACK))
//    val Michal = Dood(z,
//            Grapes.values().toList(),
//            listOf())
//    val doods = listOf(Andrew, Dmitry, Michal)
//
//    val s2 = readInts()
//    val green = GrapeQuantity(Grapes.GREEN, s2[0])
//    val purple = GrapeQuantity(Grapes.PURPLE, s2[1])
//    val black = GrapeQuantity(Grapes.BLACK, s2[2])
//    val grapes = listOf(green, purple, black)
//
//    val res: String = calc(grapes, doods)
//    println(res)
//}
//
//fun calc(availableGrapes: List<GrapeQuantity>, doods: List<Dood>): String {
////    val neededGreen
//    return ""
//}
//


fun main() {
    var str = rdInts()
    val a = str[0]
    val d = str[1]
    val m = str[2]

    str = rdInts()
    val g = str[0]
    val p = str[1]
    val b = str[2]

    val res: Boolean = calc(a, d, m, g, p, b)
    if (res) {
        println("YES")
    } else {
        println("NO")
    }
}

fun calc(a: Int, d: Int, m: Int, green: Int, p: Int, b: Int): Boolean {
    var g = green
    // enough grapes for Andrew
    if (g < a) {
        return false
    }
    g -= a

    // enough grapes for Dmitry
    if (g + p < d) {
        return false
    }

    // enough grapes left for Michal
    return (g + p + b) >= (d + m)
}
