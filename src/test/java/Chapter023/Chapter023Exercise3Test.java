package Chapter023;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter023Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter023Exercise3 exercise = new Chapter023Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}