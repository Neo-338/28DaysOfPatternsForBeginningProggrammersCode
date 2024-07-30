package Chapter012;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter012Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter012Exercise2 exercise = new Chapter012Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}