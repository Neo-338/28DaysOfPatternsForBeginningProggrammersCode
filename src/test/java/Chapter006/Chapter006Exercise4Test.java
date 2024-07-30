package Chapter006;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter006Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter006Exercise4 exercise = new Chapter006Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}