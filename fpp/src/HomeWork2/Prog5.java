package HomeWork2;

import java.util.Arrays;
public class Prog5 {
    public static void main(String[] args) {
        int[] a = new int[]{5,6,-4,3,1};
        int[] b = new int[]{ 3,8,9,11};
        System.out.println(Arrays.toString(combine(a, b)));
    }
    public static int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }
}
