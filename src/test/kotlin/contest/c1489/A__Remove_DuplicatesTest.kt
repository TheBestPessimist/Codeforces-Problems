package contest.c1489

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class A__Remove_DuplicatesTest {
    @Test
    fun a() {

        Assertions.assertThat(solve(1, 5, 5, 1, 6, 1)).isEqualTo(listOf(5, 6, 1))
        Assertions.assertThat(solve(2, 4, 2, 4, 4)).isEqualTo(listOf(2, 4))
        Assertions.assertThat(solve(6, 6, 6, 6, 6)).isEqualTo(listOf(6))
    }
}
