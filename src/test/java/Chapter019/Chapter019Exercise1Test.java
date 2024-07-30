package Chapter019;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter019Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter019Exercise1 exercise = new Chapter019Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}