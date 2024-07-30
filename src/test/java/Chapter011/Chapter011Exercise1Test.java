package Chapter011;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter011Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter011Exercise1 exercise = new Chapter011Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}