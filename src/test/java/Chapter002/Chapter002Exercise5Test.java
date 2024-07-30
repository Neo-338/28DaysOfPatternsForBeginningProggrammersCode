package Chapter002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter002Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter002Exercise5 exercise = new Chapter002Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}