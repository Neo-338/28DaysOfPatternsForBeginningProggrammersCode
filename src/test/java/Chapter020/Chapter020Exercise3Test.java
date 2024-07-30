package Chapter020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter020Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter020Exercise3 exercise = new Chapter020Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}