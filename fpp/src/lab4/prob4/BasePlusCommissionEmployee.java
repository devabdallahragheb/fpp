package lab4.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return super.getPayment() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + STR."""
                Base Salary: $\{baseSalary}
                """;
    }
}
