package Chapter022;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter022Exercise2Test {

    @Test
    void testExampleMethod() {
        Chapter022Exercise2 exercise = new Chapter022Exercise2();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}