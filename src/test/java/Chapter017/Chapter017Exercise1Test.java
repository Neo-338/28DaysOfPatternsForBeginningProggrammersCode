package Chapter017;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter017Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter017Exercise1 exercise = new Chapter017Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}