package Chapter013;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter013Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter013Exercise1 exercise = new Chapter013Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}