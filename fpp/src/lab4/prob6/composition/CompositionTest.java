package lab4.prob6.composition;


class CompositionTest {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Taxi taxi = new Taxi(new Car("BMW"), 1000);
        Taxi cheapTaxi = new Taxi(new Car("BMW"), 3000);
        Taxi luxuryTaxi = new Taxi(car, 1000);
        System.out.println(taxi.equals(cheapTaxi));
        System.out.println(taxi.equals(luxuryTaxi));
        System.out.println(cheapTaxi.equals(luxuryTaxi));
        System.out.println(luxuryTaxi.equals(car));

    }
}
