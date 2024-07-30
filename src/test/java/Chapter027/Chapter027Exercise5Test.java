package Chapter027;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter027Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter027Exercise5 exercise = new Chapter027Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}