package Chapter028;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter028Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter028Exercise3 exercise = new Chapter028Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}