package lab4.prob6.instanceofstrategy;

public class InstanceOfStrategyTest {
    public static void main(String[] args) {
        Car cheapCar = new Car("Toyota");
        Taxi taxi = new Taxi("Toyota", 2000);
        Car luxuryCar = new Car("BMW");
        System.out.println(cheapCar.equals(taxi));
        System.out.println(taxi.equals(cheapCar));
        System.out.println(taxi.equals(luxuryCar));
    }
}
