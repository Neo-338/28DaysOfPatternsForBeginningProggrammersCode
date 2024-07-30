package Chapter005;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter005Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter005Exercise2 exercise = new Chapter005Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}