package Chapter021;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter021Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter021Exercise5 exercise = new Chapter021Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}