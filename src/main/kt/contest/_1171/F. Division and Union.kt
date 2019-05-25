package kt.contest._1171

import kt.rdInt
import kt.rdInts

/**
 *
 * https://codeforces.com/contest/1171/problem/F
 *
There are n segments [li,ri] for 1≤i≤n. You should divide all segments into two non-empty groups in such way that there is no pair of segments from different groups which have at least one common point, or say that it's impossible to do it. Each segment should belong to exactly one group.

To optimize testing process you will be given multitest.

Input
The first line contains one integer T (1≤T≤50000) — the number of queries. Each query contains description of the set of segments. Queries are independent.

First line of each query contains single integer n (2≤n≤105) — number of segments. It is guaranteed that ∑n over all queries does not exceed 105.

The next n lines contains two integers li, ri per line (1≤li≤ri≤2⋅105) — the i-th segment.

Output
For each query print n integers t1,t2,…,tn (ti∈{1,2}) — for each segment (in the same order as in the input) ti equals 1 if the i-th segment will belongs to the first group and 2 otherwise.

If there are multiple answers, you can print any of them. If there is no answer, print −1.

Example
input
3
2
5 5
2 3
3
3 5
2 3
2 3
3
3 3
4 4
5 5
output
2 1
-1
1 1 2

Note
In the first query the first and the second segments should be in different groups, but exact numbers don't matter.

In the second query the third segment intersects with the first and the second segments, so they should be in the same group, but then the other group becomes empty, so answer is −1.

In the third query we can distribute segments in any way that makes groups non-empty, so any answer of 6 possible is correct.
 */


// left and right side of a segment + length of that segment
data class Segment(val left: Int, val right: Int) {
    fun length() = right - left
}

fun main() {
    repeat(rdInt()) {
        val allSegments = mutableListOf<Segment>()
        //read all [ ]
        repeat(rdInt()) {
            val ints = rdInts()
            allSegments.add(Segment(ints[0], ints[1]))
        }

        val sorted = allSegments.sortedWith(compareBy(Segment::left, Segment::length))

        // furthest right in the left group (remember that we're looking for 2 segments. try to draw more segments to see that i'm looking for the gap inbetween them)
        var breakingPoint = sorted[0].right
        for (i in 1 until sorted.size) {
            if (sorted[i].left > breakingPoint) {
                break
            }
            breakingPoint = java.lang.Integer.max(breakingPoint, sorted[i].right)
        }
//
//        println(allSegments)
//        println(sorted)
//        println(breakingPoint)

        if (breakingPoint == sorted.maxBy { it.right }!!.right) {
            print("-1")
        } else {
            allSegments.forEach {
                if (it.right <= breakingPoint) {
                    print(" 1")
                } else {
                    print(" 2")
                }
            }
        }

        println()
    }
}
