import org.example.abc
import org.example.abc2
import org.example.countXO
import org.junit.jupiter.api.*
import kotlin.test.DefaultAsserter.fail

class MainTest {

    @Test
    @DisplayName ("Method countXO test")
    fun testCountXO() {
//        Assertions.assertTrue(countXO("xxoo"))
//        Assertions.assertFalse(countXO("xxoo"))
//        Assertions.assertEquals(countXO("xxoo"), true)
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxxxxooooo"))},
            {Assertions.assertTrue(countXO("xxoxoo"))},
            {Assertions.assertTrue(countXO("AxxaXXXooxOOoo"))},
            {Assertions.assertTrue(countXO("xxooOOOxxx"))}
        )
    }

    @Test
    @Disabled
    fun notImplemented() {

    }

    @Test
    fun willFail() {
        fail("Fail method")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertTrue(abc()) // Só é executado se a assumption for verdadeira
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc2() }
    }


}