package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {
    @Test
    void reverseEmptyArray() {
        int[] input = new int[]{};
        int[] result = ReverseArray.reverse(input);
        Assertions.assertEquals(0, result.length);
    }

    @Test
    void reverseSingleElementArray() {
        int[] input = new int[]{3};
        int[] result = ReverseArray.reverse(input);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(3, result[0]);
    }

    @Test
    void reverseMultiElementArray() {
        int[] input = new int[]{1, 3, 5, 7, 9, 13};
        int[] result = ReverseArray.reverse(input);
        Assertions.assertEquals(6, result.length);
        Assertions.assertEquals(7, result[2]);
    }
}