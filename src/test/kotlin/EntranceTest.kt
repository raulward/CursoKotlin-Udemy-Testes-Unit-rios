import org.example.portaria
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class EntranceTest {

    @Test
    @DisplayName("Entrance method test")
    fun testEntrance() {
        Assertions.assertAll(
            {Assertions.assertEquals(portaria(19, "comum", "Xt121A"), "Welcome.")},
            {Assertions.assertEquals(portaria(17, "comum", "Xt121A"), "Negado.")},
            {Assertions.assertEquals(portaria(20, "adadad", "Xt121A"), "Negado.")},
            {Assertions.assertEquals(portaria(20, "premium", "xtadade"), "Negado.")},
            {Assertions.assertEquals(portaria(20, "luxo", "xladada"), "Welcome.")},
            {Assertions.assertEquals(portaria(-1000, "luxo", "xladada"), "Negado.")},
            {Assertions.assertEquals(portaria(-1000, "luxo", "xladada"), "Negado.")},
            {Assertions.assertNotNull(portaria(-1000, "", "xladada"), "Negado.")},
            {Assertions.assertNotNull(portaria(-1000, "premium", ""), "Negado.")},
            {Assertions.assertNotNull(portaria(30, "premium", "xladada"), "Welcome")},
            {Assertions.assertNotNull(portaria(30, "", ""), "Welcome")},
        )

    }
}