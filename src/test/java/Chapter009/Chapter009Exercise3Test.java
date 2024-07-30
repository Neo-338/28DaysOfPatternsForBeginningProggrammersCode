package Chapter009;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter009Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter009Exercise3 exercise = new Chapter009Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}