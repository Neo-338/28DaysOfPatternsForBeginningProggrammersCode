package Chapter019;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter019Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter019Exercise2 exercise = new Chapter019Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}