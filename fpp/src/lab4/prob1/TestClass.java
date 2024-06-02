package lab4.prob1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Clothing("Jean", 150.8, "Gucci", 30);
        products[1] = new Electronics("Cellphone", 999.9, 6, 35);
        products[2] = new Furniture("Desk", 149.99, "Wood", 49.99);
        products[3] = new Clothing("Jacket", 199.99, "Adidas", 25);
        products[4] = new Electronics("Microwave", 249.99, 12, 23);

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
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
