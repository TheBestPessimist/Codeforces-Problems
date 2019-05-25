package kt.contest._1171

/**
 *
 * https://codeforces.com/contest/1171/problem/C
 *
You are given a string s consisting only of lowercase Latin letters.

You can rearrange all letters of this string as you wish. Your task is to obtain a good string by rearranging the letters of the given string or report that it is impossible to do it.

Let's call a string good if it is not a palindrome. Palindrome is a string which is read from left to right the same as from right to left. For example, strings "abacaba", "aa" and "z" are palindromes and strings "bba", "xd" are not.

You have to answer t independent queries.

Input
The first line of the input contains one integer t (1≤t≤100) — number of queries.

Each of the next t lines contains one string. The i-th line contains a string si consisting only of lowercase Latin letter. It is guaranteed that the length of si is from 1 to 1000 (inclusive).

Output
Print t lines. In the i-th line print the answer to the i-th query: -1 if it is impossible to obtain a good string by rearranging the letters of si and any good string which can be obtained from the given one (by rearranging the letters) otherwise.

Example
input
3
aa
abacaba
xdd
output
-1
abaacba
xdd

Note
In the first query we cannot rearrange letters to obtain a good string.

Other examples (not all) of correct answers to the second query: "ababaca", "abcabaa", "baacaba".

In the third query we can do nothing to obtain a good string.
 */

private fun rdLn(): String = readLine()!!

private fun rdInt(): Int = rdLn().toInt()

fun main() {
    val t = rdInt()
    for (i in 0 until t) {
        val rd = rdLn()
        val chars = rd.toList()

        val resp = calc(chars)
        println(resp)
    }

}

fun calc(chars: List<Char>): String {
    val sorted = chars.sorted()
    return if (isPalindrome(sorted)) {
        (-1).toString()
    } else {
        sorted.joinToString("")
    }
}

fun isPalindrome(chars: List<Char>): Boolean {
    return chars == chars.reversed()
}
