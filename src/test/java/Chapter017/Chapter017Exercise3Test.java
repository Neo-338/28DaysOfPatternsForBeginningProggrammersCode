package Chapter017;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter017Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter017Exercise3 exercise = new Chapter017Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}