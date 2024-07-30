package Chapter012;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter012Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter012Exercise3 exercise = new Chapter012Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}