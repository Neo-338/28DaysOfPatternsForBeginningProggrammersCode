package Chapter009;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter009Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter009Exercise2 exercise = new Chapter009Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}