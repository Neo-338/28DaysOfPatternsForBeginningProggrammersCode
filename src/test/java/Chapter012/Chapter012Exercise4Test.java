package Chapter012;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter012Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter012Exercise4 exercise = new Chapter012Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}