package Chapter025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter025Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter025Exercise3 exercise = new Chapter025Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}