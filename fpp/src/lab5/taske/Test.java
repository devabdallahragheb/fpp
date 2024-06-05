package lab5.taske;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data, (employee1, employee2) -> employee1.getHireDate().compareTo(employee2.getHireDate()));
        System.out.println(Arrays.toString(data));
    }
}
