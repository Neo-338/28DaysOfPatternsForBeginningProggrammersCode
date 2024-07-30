package Chapter001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter001Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter001Exercise5 exercise = new Chapter001Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}