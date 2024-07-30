package Chapter009;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter009Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter009Exercise5 exercise = new Chapter009Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}