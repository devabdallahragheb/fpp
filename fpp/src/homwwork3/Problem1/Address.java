package homwwork3.Problem1;

public class Address {
    private  String street;


    public String getCity() {
        return city;
    }



    private  String city;
    private  String state;
    private  String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


}
