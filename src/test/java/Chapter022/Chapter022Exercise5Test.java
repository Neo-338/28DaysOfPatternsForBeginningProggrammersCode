package Chapter022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter022Exercise5Test {

    @Test
    void testExampleMethod() {
        Chapter022Exercise5 exercise = new Chapter022Exercise5();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}