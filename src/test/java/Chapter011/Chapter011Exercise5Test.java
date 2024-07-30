package Chapter011;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter011Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter011Exercise5 exercise = new Chapter011Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}