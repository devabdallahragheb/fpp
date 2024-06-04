package lab4.prob2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private final double salary;
    private LocalDate hiredDate;
    public DeptEmployee(String name, double salary, LocalDate hiredDate) {
        this.name = name;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public double computeSalary() {
        return salary;
    }
}
