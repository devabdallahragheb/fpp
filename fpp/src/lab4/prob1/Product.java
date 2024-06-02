package lab4.prob1;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void printStatus(){
        System.out.print(STR."""
                        Name: \{productName}
                        Price: \{getPrice()}
                        """);
    }
}
