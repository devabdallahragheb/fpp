package lab4.prob4;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + STR."""
                Gross Sale: $\{grossSales}
                Commission Rate: \{commissionRate}%
                """;
    }
}
