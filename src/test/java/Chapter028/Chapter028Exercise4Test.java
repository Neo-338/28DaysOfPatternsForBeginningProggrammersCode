package Chapter028;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter028Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter028Exercise4 exercise = new Chapter028Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}