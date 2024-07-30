package Chapter019;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter019Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter019Exercise5 exercise = new Chapter019Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}