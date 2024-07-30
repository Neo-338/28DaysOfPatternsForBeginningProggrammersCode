package Chapter020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter020Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter020Exercise4 exercise = new Chapter020Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}