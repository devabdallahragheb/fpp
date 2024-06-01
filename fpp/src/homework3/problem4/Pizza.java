package homework3.problem4;

public class Pizza {
    private final static double TAX_RATE = 0.03;
    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;
    private double tax;
    private double totalPrice;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        this.price = calculatePrice();
        this.tax = calculateTax();
        this.totalPrice = calculatePriceWithTax();
    }

    private double calculatePrice(){
        double sizePrice = switch (this.size) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };

        double typePrice = switch (this.type) {
            case CHEEZE -> 1.5;
            case VEGGIE -> 1;
            case PEPPERONI, BBQ_CHICKEN -> 2;
        };
        return  (sizePrice + typePrice) * this.quantity;
    }

    private double calculateTax(){
        return this.price * TAX_RATE;
    }

    private double calculatePriceWithTax(){
        return this.price + this.tax;
    }

    public String printOrderSummary(){
        return String.format("""
                        Pizza Order:
                        Size: %s
                        Type: %s
                        Qty: %d
                        Price: $%.2f
                        Tax: $%.2f
                        Total Price: $%2.2f""",
                this.size, this.type, this.quantity, this.price, this.tax, this.totalPrice);
    }
}
