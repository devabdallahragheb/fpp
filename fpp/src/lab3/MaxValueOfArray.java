package lab3;

public class MaxValueOfArray {
    public static void main(String[] args) {
        findMaxValueOfArray(new int[]{5, -3, 6, 1, 9, 4 });
    }

    public static void findMaxValueOfArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.printf("Max value of array: %d \n", findMax(arr, arr.length - 1));
        }

    }

    private static int findMax(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return Math.max(array[index], findMax(array, index - 1));
    }
}
