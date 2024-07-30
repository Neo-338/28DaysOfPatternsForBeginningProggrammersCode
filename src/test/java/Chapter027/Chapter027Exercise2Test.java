package Chapter027;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter027Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter027Exercise2 exercise = new Chapter027Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}