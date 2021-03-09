package contest.c1171

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class C_Letters_Rearranging_Test {


    @Test
    fun isPalindrome1() {
        val l = "abacaba".toList()
        val exp = true
        assertEquals(exp, isPalindrome(l))
    }

    @Test
    fun isPalindrome2() {
        val l = "aa".toList()
        val exp = true
        assertEquals(exp, isPalindrome(l))
    }

    @Test
    fun isPalindrome3() {
        val l = "z".toList()
        val exp = true
        assertEquals(exp, isPalindrome(l))
    }

    @Test
    fun isPalindrome4() {
        val l = "bba".toList()
        val exp = false
        assertEquals(exp, isPalindrome(l))
    }

    @Test
    fun isPalindrome5() {
        val l = "xd".toList()
        val exp = false
        assertEquals(exp, isPalindrome(l))
    }


    @Test
    fun calc1() {
        val l = "aa".toList()
        val exp = "-1"

        assertEquals(exp, calc(l))
    }

    @Test
    fun calc2() {
        val l = "abacaba".toList()
        val exp = "aaaabbc"

        assertEquals(exp, calc(l))
    }

    @Test
    fun calc3() {
        val l = "xdd".toList()
        val exp = "ddx"

        assertEquals(exp, calc(l))
    }
}
