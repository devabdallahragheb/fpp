package homework4.prob1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Clothing("Jean", 150.8, "Gucci", 30);
        products[1] = new Electronics("Cellphone", 999.9, 6, 35);
        products[2] = new Furniture("Desk", 149.99, "Wood", 49.99);
        products[3] = new Clothing("Jacket", 199.99, "Adidas", 25);
        products[4] = new Electronics("Microwave", 249.99, 12, 23);

        for (Product product : products) {
            if (product instanceof Clothing clothing) {
                System.out.println(STR."""
                        Name: \{clothing.getProductName()}
                        Price: $\{clothing.getPrice()}
                        Brand: \{clothing.getBrand()}
                        Discount: \{clothing.getDiscountPercentage()}%
                        """);
            } else if (product instanceof Electronics electronic) {
                System.out.println(STR."""
                        Name: \{electronic.getProductName()}
                        Price: $\{electronic.getPrice()}
                        Warranty: \{electronic.getWarranty()} month(s)
                        Warranty Cost: $\{electronic.getWarrantyCost()}
                        """);
            } else if (product instanceof Furniture furniture) {
                System.out.println(STR."""
                        Name: \{furniture.getProductName()}
                        Price: $\{furniture.getPrice()}
                        Material: \{furniture.getMaterial()}
                        Shipping Cost: $\{furniture.getShippingCost()}
                        """);
            }
        }
        System.out.printf("Sum of all products: $%.2f \n", sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        double sum = 0;
        if (col != null) {
            for (Product product : col) {
                if (product != null) {
                    sum += product.getPrice();
                }
            }
        }

        return sum;
    }
}
