package lab4.prob4;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

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
