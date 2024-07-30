package Chapter026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter026Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter026Exercise5 exercise = new Chapter026Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}