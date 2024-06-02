package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExponentialTest {

    @Test
    void powerToZero() {
        Assertions.assertEquals(1, new Exponential().power(3, 0));
    }

    @Test
    void powerWithNegativeNumber() {
        Assertions.assertEquals(-8, new Exponential().power(-2, 3));
    }

    @Test
    void powerWithZero() {
        Assertions.assertEquals(0, new Exponential().power(0, 3));
    }

    @Test
    void powerWithPositiveNumber() {
        Assertions.assertEquals(27, new Exponential().power(3, 3));
    }
}