package Chapter024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter024Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter024Exercise3 exercise = new Chapter024Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}