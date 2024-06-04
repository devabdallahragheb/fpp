package lab4.prob6.sameclassstrategy;

class SameClassStrategyTest {
    public static void main(String[] args) {
        Car cheapCar = new Car("Ford");
        Taxi taxi = new Taxi("Ford", 1000);
        Car luxuryCar = new Car("BMW");
        System.out.println(cheapCar.equals(taxi));
        System.out.println(taxi.equals(cheapCar));
        System.out.println(taxi.equals(luxuryCar));
    }
}
