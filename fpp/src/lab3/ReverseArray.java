package lab3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] reverse(int[] arr) {
        return reverse(arr, 0, arr.length - 1);
    }

    private static int[] reverse(int[] array, int start, int end) {
        if (start >= end) {
            return array;
        } else {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            return reverse(array, start + 1, end - 1);
        }
    }
}
