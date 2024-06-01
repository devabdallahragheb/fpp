package lab3;

public class Exponential {
    public static void main(String[] args) {
        Exponential exponential = new Exponential();
        System.out.println(exponential.power(2, 10));
    }
    public double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
