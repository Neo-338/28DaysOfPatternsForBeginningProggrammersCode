package Chapter014;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter014Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter014Exercise5 exercise = new Chapter014Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}