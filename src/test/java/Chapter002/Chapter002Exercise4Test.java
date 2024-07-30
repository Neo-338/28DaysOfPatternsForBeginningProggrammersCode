package Chapter002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter002Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter002Exercise4 exercise = new Chapter002Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}