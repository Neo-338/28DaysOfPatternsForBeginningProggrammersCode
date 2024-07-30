package Chapter021;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter021Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter021Exercise3 exercise = new Chapter021Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}