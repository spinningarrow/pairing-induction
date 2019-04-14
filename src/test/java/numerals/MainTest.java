package numerals;

import org.junit.jupiter.api.Test;

import static numerals.Main.convertToDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5ExampleTest {

    @Test
    void justAnExample() {
        assertEquals(0, convertToDecimal(""));
    }
}
