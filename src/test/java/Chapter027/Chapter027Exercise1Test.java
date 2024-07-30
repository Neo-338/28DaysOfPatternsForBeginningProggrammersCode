package Chapter027;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter027Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter027Exercise1 exercise = new Chapter027Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}