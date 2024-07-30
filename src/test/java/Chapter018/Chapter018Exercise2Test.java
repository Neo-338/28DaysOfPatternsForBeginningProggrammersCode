package Chapter018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter018Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter018Exercise2 exercise = new Chapter018Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}