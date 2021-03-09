package contest.c1157

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("ClassName", "UnnecessaryVariable")
internal class B_Long_Number_Test {

    @Test
    fun example1() {
        val s1 = "4"
        val s2 = "1337"
        val s3 = "1 2 5 4 6 6 3 1 9"
        val expected = "1557"

        val n = s1
        val a = makeA(s2)
        val f = makeF(s3)

        assertEquals(expected, calculateMax(n, a, f))
    }

    @Test
    fun example2() {
        val s1 = "5"
        val s2 = "11111"
        val s3 = "9 8 7 6 5 4 3 2 1"
        val expected = "99999"

        val n = s1
        val a = makeA(s2)
        val f = makeF(s3)

        assertEquals(expected, calculateMax(n, a, f))
    }

    @Test
    fun example3() {
        val s1 = "2"
        val s2 = "33"
        val s3 = "1 1 1 1 1 1 1 1 1"
        val expected = "33"

        val n = s1
        val a = makeA(s2)
        val f = makeF(s3)

        assertEquals(expected, calculateMax(n, a, f))
    }
}
