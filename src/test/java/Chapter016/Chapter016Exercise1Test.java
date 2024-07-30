package Chapter016;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter016Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter016Exercise1 exercise = new Chapter016Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}