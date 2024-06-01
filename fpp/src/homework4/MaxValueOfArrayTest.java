package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxValueOfArrayTest {
    @Test
    void maxValueOfEmptyArray() {
        Assertions.assertEquals(Integer.MIN_VALUE, MaxValueOfArray.findMaxValueOfArray(new int[]{}));
    }

    @Test
    void maxValueOfSingleElementArray() {
        Assertions.assertEquals(3, MaxValueOfArray.findMaxValueOfArray(new int[]{3}));
    }

    @Test
    void maxValueOfMultiElementArray() {
        Assertions.assertEquals(9, MaxValueOfArray.findMaxValueOfArray(new int[]{5, -3, 6, 1, 9, 4}));
    }
}