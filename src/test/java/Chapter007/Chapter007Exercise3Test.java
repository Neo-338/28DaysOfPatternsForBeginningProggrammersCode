package Chapter007;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter007Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter007Exercise3 exercise = new Chapter007Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}