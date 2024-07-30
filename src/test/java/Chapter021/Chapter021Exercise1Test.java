package Chapter021;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter021Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter021Exercise1 exercise = new Chapter021Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}