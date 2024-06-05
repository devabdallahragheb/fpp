package lab5.taske;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double netSalary;
    private final double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    //overrides superclass method
    public double getSalary() {
        netSalary = super.getSalary() + 12 * overtimeHours;
        return netSalary;
    }

    @Override
    public String toString() {
        return "name=" + super.getName() + ", salary=" + netSalary + ", hireDate=" + super.getHireDate();
    }
}
