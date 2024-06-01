package homework2;

public class Prog6 {
    public static void main(String[] args) {
        secondMin(new int[]{2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
    }

    public static void secondMin(int[] arrayOfInts) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < min) {
                secondMin = min;
                min = arrayOfInts[i];
            } else if (arrayOfInts[i] > min && arrayOfInts[i] < secondMin) {
                secondMin = arrayOfInts[i];
            }
        }

        if (secondMin == min) {
            System.out.println("There is no second min for this array");
        } else {
            System.out.printf("Second Min: %d \n", secondMin);
        }
    }
}
