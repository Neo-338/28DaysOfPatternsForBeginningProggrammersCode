package Chapter020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter020Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter020Exercise5 exercise = new Chapter020Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}