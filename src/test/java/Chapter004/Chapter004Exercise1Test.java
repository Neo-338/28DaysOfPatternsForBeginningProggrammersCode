package Chapter004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter004Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter004Exercise1 exercise = new Chapter004Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}