package lab7.prob2;

public final class Teacher implements EmployeeData {
    private final double bonus;
    private final String name;
    private final double salary;

    public Teacher(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getBonus() {
        return bonus;
    }
}
