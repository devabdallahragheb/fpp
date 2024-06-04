package lab4.prob4;

public class HourlyEmployee extends Employee{
    private final double wage;
    private final double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return hours * wage;
    }

    @Override
    public String toString() {
        return super.toString() + STR."""
                Wage: $\{wage}
                Hours: \{hours}
                """;
    }
}
