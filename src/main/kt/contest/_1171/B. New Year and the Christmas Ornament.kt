package kt.contest._1171

/**
 * https://codeforces.com/contest/1171/problem/B
 *
Alice and Bob are decorating a Christmas Tree.

Alice wants only 3 types of ornaments to be used on the Christmas Tree: yellow, blue and red. They have y yellow ornaments, b blue ornaments and r red ornaments.

In Bob's opinion, a Christmas Tree will be beautiful if:

the number of blue ornaments used is greater by exactly 1 than the number of yellow ornaments, and
the number of red ornaments used is greater by exactly 1 than the number of blue ornaments.
That is, if they have 8 yellow ornaments, 13 blue ornaments and 9 red ornaments, we can choose 4 yellow, 5 blue and 6 red ornaments (5=4+1 and 6=5+1).

Alice wants to choose as many ornaments as possible, but she also wants the Christmas Tree to be beautiful according to Bob's opinion.

In the example two paragraphs above, we would choose 7 yellow, 8 blue and 9 red ornaments. If we do it, we will use 7+8+9=24 ornaments. That is the maximum number.

Since Alice and Bob are busy with preparing food to the New Year's Eve, they are asking you to find out the maximum number of ornaments that can be used in their beautiful Christmas Tree!

It is guaranteed that it is possible to choose at least 6 (1+2+3=6) ornaments.

Input
The only line contains three integers y, b, r (1≤y≤100, 2≤b≤100, 3≤r≤100) — the number of yellow, blue and red ornaments.

It is guaranteed that it is possible to choose at least 6 (1+2+3=6) ornaments.

Output
Print one number — the maximum number of ornaments that can be used.

Examples
input
8 13 9
output
24

input
13 3 6
output
9

Note
In the first example, the answer is 7+8+9=24.

In the second example, the answer is 2+3+4=9.


 */

private fun rdLn(): String = readLine()!!

fun main() {
    val s = rdLn().split(" ").map { it -> it.toInt() }
    val y = s[0]
    val b = s[1]
    val r = s[2]

    val res: Int = calc(y, b, r)
    println(res)

}

/**
 * Condition:
b = y+1
r = b+1
=> y<b<r
 */
fun calc(yellow: Int, blue: Int, red: Int): Int {
    var y = 1
    var b = 2
    var r = 3
    var s = y + b + r
    while (true) {
        if ((y >= yellow || b >= blue || r >= red)) {
            break
        }
        y++
        b++
        r++
        s += 3
    }
    return s
}

