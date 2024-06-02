package lab4.prob4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    abstract double getPayment();

    @Override
    public String toString() {
        return STR."""
                First Name: \{firstName}
                Last Name: \{lastName}
                SSN: \{socialSecurityNumber}
                """;
    }
}
