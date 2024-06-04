package lab4.prob6.sameclassstrategy;

class Car {
    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Car car)) return false;
        return car.getBrand().equals(this.getBrand());
    }
}
