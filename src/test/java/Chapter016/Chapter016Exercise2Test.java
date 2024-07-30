package Chapter016;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter016Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter016Exercise2 exercise = new Chapter016Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}