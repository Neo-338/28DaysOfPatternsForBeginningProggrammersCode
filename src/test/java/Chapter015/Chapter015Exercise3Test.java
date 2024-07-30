package Chapter015;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Chapter015Exercise3Test {

    @Test
    void testExampleMethod() {
        Chapter015Exercise3 exercise = new Chapter015Exercise3();
        assertEquals(0, exercise.exampleMethod(), "The example method should return 0");
    }
}