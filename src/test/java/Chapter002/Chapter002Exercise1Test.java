package Chapter002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter002Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter002Exercise1 exercise = new Chapter002Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}