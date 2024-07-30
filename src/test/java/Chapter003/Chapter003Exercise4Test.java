package Chapter003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter003Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter003Exercise4 exercise = new Chapter003Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}