package Chapter008;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter008Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter008Exercise5 exercise = new Chapter008Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}