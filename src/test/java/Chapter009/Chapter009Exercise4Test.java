package Chapter009;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter009Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter009Exercise4 exercise = new Chapter009Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}