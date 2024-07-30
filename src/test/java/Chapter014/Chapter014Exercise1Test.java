package Chapter014;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter014Exercise1Test {

    @Test
    void testExampleMethod() {
        Chapter014Exercise1 exercise = new Chapter014Exercise1();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}