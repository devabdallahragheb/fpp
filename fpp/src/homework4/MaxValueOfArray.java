package homework4;

public class MaxValueOfArray {
    public static void main(String[] args) {
        System.out.printf("Max value is: %d \n", findMaxValueOfArray(new int[]{5, -3, 6, 1, 9, 4}));
    }

    public static int findMaxValueOfArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            return findMax(arr, arr.length - 1);
        }

    }

    private static int findMax(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return Math.max(array[index], findMax(array, index - 1));
    }
}
