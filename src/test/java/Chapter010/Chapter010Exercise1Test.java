package Chapter010;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter010Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter010Exercise1 exercise = new Chapter010Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}