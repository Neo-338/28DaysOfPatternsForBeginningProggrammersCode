package Chapter021;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter021Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter021Exercise2 exercise = new Chapter021Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}