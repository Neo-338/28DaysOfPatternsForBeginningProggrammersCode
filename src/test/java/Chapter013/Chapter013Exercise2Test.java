package Chapter013;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter013Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter013Exercise2 exercise = new Chapter013Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}