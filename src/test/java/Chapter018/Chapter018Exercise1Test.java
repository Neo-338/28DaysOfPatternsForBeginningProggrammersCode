package Chapter018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter018Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter018Exercise1 exercise = new Chapter018Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}