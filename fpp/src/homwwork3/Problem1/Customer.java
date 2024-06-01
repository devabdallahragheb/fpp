package homwwork3.Problem1;

public class Customer {
    private  String firstName;
    private  String lastName;
    private  String socSecurityNum;
    private   Address billingAddress;


    public Address getBillingAddress() {
        return billingAddress;
    }


    private  Address shippingAddress;

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Customer(String firstName, String socSecurityNum, String lastName) {
        this.firstName = firstName;
        this.socSecurityNum = socSecurityNum;
        this.lastName = lastName;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }



}
