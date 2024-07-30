package Chapter025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter025Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter025Exercise5 exercise = new Chapter025Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}