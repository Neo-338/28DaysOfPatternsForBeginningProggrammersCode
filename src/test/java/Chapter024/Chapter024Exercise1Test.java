package Chapter024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter024Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter024Exercise1 exercise = new Chapter024Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}