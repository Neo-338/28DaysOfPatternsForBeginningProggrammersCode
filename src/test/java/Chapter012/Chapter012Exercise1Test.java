package Chapter012;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter012Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter012Exercise1 exercise = new Chapter012Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}