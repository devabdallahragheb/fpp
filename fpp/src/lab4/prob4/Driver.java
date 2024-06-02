package lab4.prob4;

public class Driver {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("John", "Varkey", "123456", 5000, 80);
        employees[1] = new BasePlusCommissionEmployee("Renee", "Han", "234567", 7500, 70, 1000);
        employees[2] = new HourlyEmployee("Joseph", "Morton", "987654", 60, 35);
        employees[3] = new SalariedEmployee("Vinoth", "Jean", "246810", 3000);
        employees[4] = new SalariedEmployee("Percial", "Wong", "36912", 2500);

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        System.out.println("Employee with max salary is: ");
        System.out.println(findMaxSalary(employees));
    }

    public static Employee findMaxSalary (Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }
        Employee maxSalaryEmployee = col[0];
        for (Employee employee : col) {
            if (employee != null &&  employee.getPayment() > maxSalaryEmployee.getPayment()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

}
