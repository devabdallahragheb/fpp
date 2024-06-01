package homework1;

import java.util.Random;

public class Prog1 {
    public static void main(String[]args){
        // get random number
        Random rand = new Random();
        int x = rand.nextInt(1,9) ;
        int y = rand.nextInt(3,14) ;
        System.out.printf("%.2f\n",Math.pow(Math.PI, x));
        System.out.printf("%.2f",  Math.pow(y, Math.PI));
    }
}
