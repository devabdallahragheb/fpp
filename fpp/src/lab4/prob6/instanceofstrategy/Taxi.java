package lab4.prob6.instanceofstrategy;

public class Taxi extends Car {
    private final int number;

    public Taxi(String brand, int number) {
        super(brand);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
