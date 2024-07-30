package Chapter013;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter013Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter013Exercise5 exercise = new Chapter013Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}