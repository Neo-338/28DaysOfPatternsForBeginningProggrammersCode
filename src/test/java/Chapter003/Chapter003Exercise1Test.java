package Chapter003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter003Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter003Exercise1 exercise = new Chapter003Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}