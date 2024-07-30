package Chapter012;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter012Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter012Exercise5 exercise = new Chapter012Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}