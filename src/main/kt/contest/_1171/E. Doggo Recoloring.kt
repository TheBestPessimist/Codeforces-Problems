package kt.contest._1171

import kt.rdLn
import kt.toListOfString

/**
 *
 * https://codeforces.com/contest/1171/problem/E
 *
Panic is rising in the committee for doggo standardization — the puppies of the new brood have been born multi-colored! In total there are 26 possible colors of puppies in the nature and they are denoted by letters from 'a' to 'z' inclusive.

The committee rules strictly prohibit even the smallest diversity between doggos and hence all the puppies should be of the same color. Thus Slava, the committee employee, has been assigned the task to recolor some puppies into other colors in order to eliminate the difference and make all the puppies have one common color.

Unfortunately, due to bureaucratic reasons and restricted budget, there's only one operation Slava can perform: he can choose a color x such that there are currently at least two puppies of color x and recolor all puppies of the color x into some arbitrary color y. Luckily, this operation can be applied multiple times (including zero).

For example, if the number of puppies is 7 and their colors are represented as the string "abababc", then in one operation Slava can get the results "zbzbzbc", "bbbbbbc", "aaaaaac", "acacacc" and others. However, if the current color sequence is "abababc", then he can't choose x='c' right now, because currently only one puppy has the color 'c'.

Help Slava and the committee determine whether it is possible to standardize all the puppies, i.e. after Slava's operations all the puppies should have the same color.

Input
The first line contains a single integer n (1≤n≤105) — the number of puppies.

The second line contains a string s of length n consisting of lowercase Latin letters, where the i-th symbol denotes the i-th puppy's color.

Output
If it's possible to recolor all puppies into one color, print "Yes".

Otherwise print "No".

Output the answer without quotation signs.

Examples

input
6
aabddc
output
Yes

input
3
abc
output
No

input
3
jjj
output
Yes

Note
In the first example Slava can perform the following steps:

take all puppies of color 'a' (a total of two) and recolor them into 'b';
take all puppies of color 'd' (a total of two) and recolor them into 'c';
take all puppies of color 'b' (three puppies for now) and recolor them into 'c'.
In the second example it's impossible to recolor any of the puppies.

In the third example all the puppies' colors are the same; thus there's no need to recolor anything.
 */


fun main() {
    rdLn()
    val doggos = rdLn().toListOfString()

    val res: Boolean = tryColorThem(doggos)
    if (res) println("Yes") else println("No")
}

fun tryColorThem(doggos: List<String>): Boolean {
    val counted = doggos
            .groupingBy { it }
            .eachCount()

    return if (counted.size <= 1) {
        true
    } else {
        counted.any { (_, v) -> v >= 2 }
    }
}
