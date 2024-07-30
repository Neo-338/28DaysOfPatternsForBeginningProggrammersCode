package Chapter020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter020Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter020Exercise1 exercise = new Chapter020Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}