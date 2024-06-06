package lab5.taskb;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        DeptEmployee employee = data[0];
        Arrays.sort(data, employee.getComparator());
        System.out.println(Arrays.toString(data));
    }
}
