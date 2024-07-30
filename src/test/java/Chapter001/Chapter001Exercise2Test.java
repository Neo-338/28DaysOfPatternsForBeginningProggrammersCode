package Chapter001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter001Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter001Exercise2 exercise = new Chapter001Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}