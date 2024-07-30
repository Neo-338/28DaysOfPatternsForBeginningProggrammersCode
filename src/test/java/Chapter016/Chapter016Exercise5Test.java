package Chapter016;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter016Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter016Exercise5 exercise = new Chapter016Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}