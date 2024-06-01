package homework3.problem1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Cris", "Nguyen", "123456");
        Customer customer2 = new Customer("Abdullah", "Abdelglil", "456789");
        Customer customer3 = new Customer("Nan Shawng", "Nan Shawng", "789123");

        customer1.setBillingAddress(new Address("Garfield Boulevard", "Chicago", "Illinois", "60007"));
        customer1.setShippingAddress(new Address("Harlem Avenue", "Fairfield", "Iowa", "52557"));

        customer2.setBillingAddress(new Address("Paseo Boricua", "Baltimore", "Maryland", "21201"));
        customer2.setShippingAddress(new Address("Racine Avenue", "Chicago", "Illinois", "60131"));

        customer3.setBillingAddress(new Address("Sheffield Avenue", "New York", "New York", "10001"));
        customer3.setShippingAddress(new Address("Stearns Road", "Boston", "Massachusetts", "02108"));

        Customer[] customers = new Customer[]{customer1, customer2, customer3};
        for (Customer customer : customers) {
            if (customer.getBillingAddress() != null
                    && customer.getBillingAddress().getCity() != null
                    && customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
