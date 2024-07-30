package Chapter026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter026Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter026Exercise1 exercise = new Chapter026Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}