package Chapter022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter022Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter022Exercise3 exercise = new Chapter022Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}