package Chapter014;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter014Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter014Exercise3 exercise = new Chapter014Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}