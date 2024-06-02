package lab4.prob1;

public class Clothing extends Product {
    private final String brand;
    private final double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (100 - discountPercentage) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + STR."""
                        Brand: \{brand}
                        Discount: \{discountPercentage}%
                        """;
    }
}
