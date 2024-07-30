package Chapter017;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter017Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter017Exercise4 exercise = new Chapter017Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}