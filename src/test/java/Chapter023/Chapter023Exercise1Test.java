package Chapter023;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter023Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter023Exercise1 exercise = new Chapter023Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}