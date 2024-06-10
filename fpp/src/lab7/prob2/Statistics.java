package lab7.prob2;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> employeeData) {
        double sum = 0;
        if (employeeData == null) {
            return sum;
        }
        for (EmployeeData employee : employeeData) {
            if (employee != null)
                sum += employee.getSalary();
        }
        return sum;
    }
}
