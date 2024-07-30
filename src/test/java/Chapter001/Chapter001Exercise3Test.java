package Chapter001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter001Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter001Exercise3 exercise = new Chapter001Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}