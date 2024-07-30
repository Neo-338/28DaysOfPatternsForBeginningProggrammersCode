package Chapter020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter020Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter020Exercise2 exercise = new Chapter020Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}