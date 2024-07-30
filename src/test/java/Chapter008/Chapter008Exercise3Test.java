package Chapter008;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter008Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter008Exercise3 exercise = new Chapter008Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}