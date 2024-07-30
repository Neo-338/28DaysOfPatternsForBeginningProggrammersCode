package Chapter018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter018Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter018Exercise4 exercise = new Chapter018Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}