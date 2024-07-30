package Chapter003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter003Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter003Exercise5 exercise = new Chapter003Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}