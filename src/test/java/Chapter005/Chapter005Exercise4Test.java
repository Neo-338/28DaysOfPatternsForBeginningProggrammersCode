package Chapter005;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter005Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter005Exercise4 exercise = new Chapter005Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}