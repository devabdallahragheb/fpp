package lab4.prob1;

public class Furniture extends Product {
    private final String material;
    private final double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    public String getMaterial() {
        return material;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
