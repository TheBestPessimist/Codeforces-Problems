//package kt.contest._1171
//
//import kt.testRdInts
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Test
//
//internal class D_Got_Any_Grapes_Test {
//
//    @Test
//    fun calc1() {
//        var str = testRdInts("1 6 2")
//        val a = str[0]
//        val d = str[1]
//        val m = str[2]
//
//        str = testRdInts("4 3 3")
//        val g = str[0]
//        val p = str[1]
//        val b = str[2]
//
//        val exp = true
//
//        val res: Boolean = calc(a, d, m, g, p, b)
//        assertEquals(exp, res)
//    }
//
//
//    @Test
//    fun calc2() {
//        var str = testRdInts("5 1 1")
//        val a = str[0]
//        val d = str[1]
//        val m = str[2]
//
//        str = testRdInts("4 3 2")
//        val g = str[0]
//        val p = str[1]
//        val b = str[2]
//
//        val exp = false
//
//        val res: Boolean = calc(a, d, m, g, p, b)
//        assertEquals(exp, res)
//    }
//
//}
