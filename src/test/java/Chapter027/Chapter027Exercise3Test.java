package Chapter027;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter027Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter027Exercise3 exercise = new Chapter027Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}