package Chapter024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter024Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter024Exercise4 exercise = new Chapter024Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}