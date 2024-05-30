package HomwWork3.Problem1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("abdo", "123456", "abdelglil");
        c1.setShippingAddress(new Address("1000", "iowa", "fairfiled", "52467"));
        c1.setBillingAddress(new Address("1001", "iowa", "jefroseon", "52467"));
        Customer c2 = new Customer("magdy", "123456", "abdelglil");
        c2.setShippingAddress(new Address("1000", "Chicago", "fairfiled", "52467"));
        c2.setBillingAddress(new Address("1001", "Chicago", "jefroseon", "52467"));
        Customer c3 = new Customer("jeams", "123456", "chan");
        c3.setShippingAddress(new Address("1000", "Chicago", "fairfiled", "52467"));
        c3.setBillingAddress(new Address("1001", "Chicago", "jefroseon", "52467"));
        Customer[] customersArray = new Customer[3];
        customersArray[0] = c1;
        customersArray[1] = c2;
        customersArray[2] = c3;
        for (var customer : customersArray) {
            if (customer.getBillingAddress() != null && customer.getBillingAddress().getCity() != null)
                if (customer.getBillingAddress().getCity().equals("Chicago"))
                    System.out.println(customer);

        }
    }
}
