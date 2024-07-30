package Chapter022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter022Exercise4Test {

    @Test
    void testExampleMethod() {
        Chapter022Exercise4 exercise = new Chapter022Exercise4();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}