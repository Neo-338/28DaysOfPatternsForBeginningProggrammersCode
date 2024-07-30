package Chapter014;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter014Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter014Exercise4 exercise = new Chapter014Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}