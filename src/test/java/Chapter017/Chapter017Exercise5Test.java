package Chapter017;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter017Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter017Exercise5 exercise = new Chapter017Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}