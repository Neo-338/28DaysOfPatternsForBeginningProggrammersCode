package Chapter011;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter011Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter011Exercise3 exercise = new Chapter011Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}