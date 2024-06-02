package homework4.prob1;

public class Electronics extends Product {
    private final int warranty;
    private final double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    public int getWarranty() {
        return warranty;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }
}
