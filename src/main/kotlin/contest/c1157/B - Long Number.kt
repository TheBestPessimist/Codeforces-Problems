package contest.c1157

/**
 * https://codeforces.com/contest/_1157/problem/B
 *
 *
You are given a long decimal number a consisting of n digits from 1 to 9. You also have a function f that maps every digit from 1 to 9 to some (possibly the same) digit from 1 to 9.

You can perform the following operation no more than once: choose a non-empty contiguous subsegment of digits in a, and replace each digit x from this segment with f(x). For example, if a=1337, f(1)=1, f(3)=5, f(7)=3, and you choose the segment consisting of three rightmost digits, you get 1553 as the result.

What is the maximum possible number you can obtain applying this operation no more than once?

Input
The first line contains one integer n (1≤n≤2⋅105) — the number of digits in a.

The second line contains a string of n characters, denoting the number a. Each character is a decimal digit from 1 to 9.

The third line contains exactly 9 integers f(1), f(2), ..., f(9) (1≤f(i)≤9).

Output
Print the maximum number you can get after applying the operation described in the statement no more than once.



Examples

input
4
1337
1 2 5 4 6 6 3 1 9
output
1557

input
5
11111
9 8 7 6 5 4 3 2 1
output
99999

input
2
33
1 1 1 1 1 1 1 1 1
output
33
 */

private fun readLn() = readLine()!!

internal fun makeA(a: String) = a.split("").filter { it -> it != "" }.map { it -> it.toInt() }.toMutableList()
internal fun makeF(f: String) = (listOf("0") + f.split(" ")).filter { it -> it != "" }.map { it -> it.toInt() }

fun main() {
    val n = readLn()
    val a = makeA(readLn())
    val f = makeF(readLn())

    val l = calculateMax(n, a, f)
    println(l)
}

fun calculateMax(n: String, a: MutableList<Int>, f: List<Int>): String {
    var started = false

    for (i in 0 until n.toInt()) {
        val ai = a[i]
        val fai = f[a[i]]

        if (started && ai > fai) {
            break
        } else if (ai < fai) {
            started = true
            a[i] = fai
        }
    }
    return a.joinToString("")
}