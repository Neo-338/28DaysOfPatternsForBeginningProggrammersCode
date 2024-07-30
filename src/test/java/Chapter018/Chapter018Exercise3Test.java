package Chapter018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter018Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter018Exercise3 exercise = new Chapter018Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}