package lab9.prob2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> employees = new ArrayList<>();
        if (socSecNums == null || socSecNums.isEmpty()) {
            return employees;
        }
        table.forEach((ssn, employee) -> {
            if (socSecNums.contains(ssn) && ssn != null && employee != null && employee.getSalary() > 80000) {
                employees.add(employee);
            }
        });

        employees.sort((employee1, employee2) -> {
            return employee1.getSsn().compareTo(employee2.getSsn());
        });
        return employees;

    }

}
