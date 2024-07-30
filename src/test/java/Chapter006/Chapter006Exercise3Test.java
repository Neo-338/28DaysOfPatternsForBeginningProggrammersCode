package Chapter006;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter006Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter006Exercise3 exercise = new Chapter006Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}