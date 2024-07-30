package Chapter016;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter016Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter016Exercise3 exercise = new Chapter016Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}