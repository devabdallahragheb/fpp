package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinCharOfStringTest {
    @Test
    void minCharOfEmptyString() {
        Assertions.assertEquals(' ', MinCharOfString.findMinChar(""));
    }

    @Test
    void minCharOfSingleCharString() {
        Assertions.assertEquals('A', MinCharOfString.findMinChar("A"));
    }

    @Test
    void minCharOfMultiCharString() {
        Assertions.assertEquals('-', MinCharOfString.findMinChar("fpp-group4"));
    }
}