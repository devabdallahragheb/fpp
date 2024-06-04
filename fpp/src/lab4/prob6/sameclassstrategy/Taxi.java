package lab4.prob6.sameclassstrategy;

class Taxi extends Car {
    private final int number;

    public Taxi(String brand, int number) {
        super(brand);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Taxi taxi = (Taxi) obj;
        return taxi.getBrand().equals(this.getBrand()) && taxi.getNumber() == this.getNumber();
    }
}
