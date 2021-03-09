package contest.c1171

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Suppress("ClassName")
internal class B_New_Year_and_the_Christmas_Ornament_Test {

    @Test
    fun calc1() {
        val y = 8
        val b = 13
        val r = 9
        val exp = 24

        assertEquals(exp, calc(y, b, r))
    }

    @Test
    fun calc2() {
        val y = 13
        val b = 3
        val r = 6
        val exp = 9

        assertEquals(exp, calc(y, b, r))
    }
}
