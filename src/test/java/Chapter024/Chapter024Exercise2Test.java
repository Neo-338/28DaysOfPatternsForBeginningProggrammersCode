package Chapter024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter024Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter024Exercise2 exercise = new Chapter024Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}