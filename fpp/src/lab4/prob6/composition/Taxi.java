package lab4.prob6.composition;

class Taxi {
    private final Car car;
    private final int number;

    public Taxi(Car car, int number) {
        this.car = car;
        this.number = number;
    }

    public Car getCar() {
        return car;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Taxi taxi)) return false;
        return taxi.getCar().equals(this.car) && taxi.getNumber() == this.number;
    }
}
