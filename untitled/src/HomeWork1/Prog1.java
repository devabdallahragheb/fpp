package HomeWork1;

import java.util.Random;

public class Prog1 {
    public static void main(String[]args){
        Random rand = new Random();
        int x = rand.nextInt(9) + 1;
        int y = rand.nextInt(14 - 3 + 1) + 3;
        System.out.printf(" %.2f\n", Math.PI * x);
        System.out.printf("%.2f",  y * Math.PI);
    }
}
