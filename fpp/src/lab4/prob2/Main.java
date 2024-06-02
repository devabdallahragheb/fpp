package lab4.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] employees = new DeptEmployee[5];
        employees[0] = new Professor("John", 5000, LocalDate.of(2022, 10, 20), 30);
        employees[1] = new Professor("Bill", 8000, LocalDate.of(2019, 8, 13), 20);
        employees[2] = new Professor("Anne", 9000, LocalDate.of(2024, 2, 8), 25);
        employees[3] = new Secretary("Lina", 4000, LocalDate.of(2024, 4, 30), 12);
        employees[4] = new Secretary("Chen", 5500, LocalDate.of(2018, 12, 15), 20);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to check salary of all employees? Y/N");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.printf("Total salary is: $%.2f \n", getTotalSalary(employees));
                System.out.printf("Average salary is: $%.2f \n", getAverageSalary(employees));
                break;
            } else if (input.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private static double getTotalSalary(DeptEmployee[] employees) {
        double sumSalary = 0;
        for (DeptEmployee employee : employees) {
            if (employee != null) {
                sumSalary += employee.computeSalary();
            }
        }
        return sumSalary;
    }

    private static double getAverageSalary(DeptEmployee[] employees) {
        return getTotalSalary(employees) / employees.length;
    }
}
